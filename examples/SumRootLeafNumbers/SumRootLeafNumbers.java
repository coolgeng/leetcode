import java.util.*;

class SumRootLeafNumbers {
	public int sumNumbers(TreeNode root) {
		if (root == null) return 0;
		return sumNumbers(root, root.val);
	}
	
	private int sumNumbers(TreeNode root, int val) {
		if (root.left == null && root.right == null) {
			return val;
		}
		int sum = 0;
		if (root.left != null) {
			sum += sumNumbers(root.left, val*10 + root.left.val);
		}
		if (root.right != null) {
			sum += sumNumbers(root.right, val*10 + root.right.val);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		SumRootLeafNumbers sr = new SumRootLeafNumbers();
		TreeNode root = new TreeNode(1);				
		System.out.println(sr.sumNumbers(root));
	}
}