import java.util.List;
import java.util.ArrayList;

class BinaryTreeLevelOrder {
	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		search(root, 0, result);
		return result;
	}
	
	private void search(TreeNode root, int level,  ArrayList<ArrayList<Integer>> result){
		if (root == null) {
        return;
    }
		
		if (level >= result.size()) {
        result.add(new ArrayList<Integer>());
    }
    result.get(level).add(root.val);
    search(root.left, level + 1, result);
    search(root.right, level + 1, result);			
	}
	
	public static void main(String[] args) {
		BinaryTreeLevelOrder bt = new BinaryTreeLevelOrder();
		TreeNode root = new TreeNode(1);
		TreeNode left = new TreeNode(2);
		TreeNode right = new TreeNode(3);
		root.left = left;
		root.right = right;
		TreeNode left1 = new TreeNode(5);
		TreeNode right1 = new TreeNode(6);
		TreeNode left2 = new TreeNode(7);
		TreeNode right2 = new TreeNode(8);
		left.left = left1;
		left.right = right1;
		right.left = left2;
		right.right = right2;
		
		ArrayList result = bt.levelOrder(root);
		for (int i =0 ; i<result.size();i++){
			ArrayList temp = (ArrayList)result.get(i);		
			for (int j=0; j< temp.size(); j++){				
				System.out.print(temp.get(j));
			}
			System.out.println("");
		}
	}
}