import java.util.*;

class VerifyPreorderSequenceBinarySearchTree {
	public boolean verifyPreorder(int[] preorder) {
		if (preorder == null || preorder.length ==0 ) return true;
		Stack<Integer> stack = new Stack<Integer>();
		int lower = Integer.MIN_VALUE;
		for (int i = 0 ; i < preorder.length ; i ++) {
			if (preorder[i] < lower) {
				return false;
			} 
			
			while(!stack.empty()&& preorder[i] > stack.peek()) {
				lower = stack.pop();
			}
				stack.push(preorder[i]);
		}
		return true;
	}
	
	public static void main(String[] args) {
		VerifyPreorderSequenceBinarySearchTree vp = new VerifyPreorderSequenceBinarySearchTree();
		// int[] input = {1,2,3,4,5,6};
		int[] input = {6,2,3,4,5,1};
		System.out.println(vp.verifyPreorder(input));
	}
}