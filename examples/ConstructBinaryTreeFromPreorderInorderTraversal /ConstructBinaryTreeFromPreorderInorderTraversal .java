class ConstructBinaryTreeFromPreorderInorderTraversal {
  
  public TreeNode buildTree(int[] preorder, int[] inorder) {
    if (preorder == null || inorder == null) return null;
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0 ; i < inorder.length ; i ++){
      map.put(inorder[i], i);
    } 
    return buildTreeHelper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, map);
  }
  
  private TreeNode buildTreeHelper(int[] preorder, int pl, int pr, int[] inorder, int il, int ir, HashMap<Integer, Integer> map) {
    if (pl>pr || il > ir) {return null;}
    TreeNode root = new TreeNode(preorder[pl]);
    int index = map.get(root.val);
    root.left = buildTreeHelper(preorder, pl + 1, index - il + pl, inorder, il, index - 1, map );
    root.right = buildTreeHelper(preorder, index - il + pl + 1, pr, inorder, index + 1, ir, map);
    return root;
  }
  
  public static void main(String[] args) {
    ConstructBinaryTreeFromPreorderInorderTraversal cb = new ConstructBinaryTreeFromPreorderInorderTraversal();
    
  }
}