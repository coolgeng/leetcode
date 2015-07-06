class InvertBinaryTree {
	
	public TreeNode invertTree(TreeNode root) {
		if(root!=null){
				revert(root);
		} 
		return root;    
	}
	
	private void revert(TreeNode root) {
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		
		if (root.left != null) {
			invertTree(root.left);
		} 
		
		if (root.right !=null) {
			invertTree(root.right);			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println();		
	}
}