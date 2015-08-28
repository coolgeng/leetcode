class ConvertSortedListtoBinarySearchTree {	
  private ListNode current;
  
	private TreeNode sortedListToBSTHelper(int size){
    if (size <= 0) {
      return null;
    }
    TreeNode left = sortedListToBSTHelper(size /2);
    TreeNode root = new TreeNode(current.val);
    current = current.next;
    TreeNode right = sortedListToBSTHelper(size - 1 - size / 2);
    root.left = left;
    root.right = right;
    return root;
	}
  
	public TreeNode sortedListToBST(ListNode head) {
    int size = 0 ;
    ListNode p = head;
    current = head; 
    while (p != null) {
      size += 1;
      p = p.next;
    }
    return sortedListToBST(size);
	}
	
	public static void main(String[] args) {
		ConvertSortedListtoBinarySearchTree cs = new ConvertSortedListtoBinarySearchTree();
      
		System.out.println();
	}
}