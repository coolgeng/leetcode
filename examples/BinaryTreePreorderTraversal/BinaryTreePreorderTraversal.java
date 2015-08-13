import java.util.List;
import java.util.ArrayList;

class BinaryTreePreorderTraversal {
	//solution 1
	// public List<Integer> preorderTraversal(TreeNode root) {
// 		List<Integer> ans = new ArrayList<Integer>();
// 		preorderTraversal(ans, root);
// 		return ans;
// 	}
//
// 	private void preorderTraversal(List<Integer> ans, TreeNode root){
// 		if (root == null) return;
// 		ans.add(root.val);
// 		preorderTraversal(ans, root.left);
// 		preorderTraversal(ans, root.right);
// 	}

	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> ans = new ArrayList<Integer>();
		preorderTraversal(ans, root);
		return ans;
	}
	
	public static void main(String[] args) {
		BinaryTreePreorderTraversal bt = new BinaryTreePreorderTraversal();
		
	}
}