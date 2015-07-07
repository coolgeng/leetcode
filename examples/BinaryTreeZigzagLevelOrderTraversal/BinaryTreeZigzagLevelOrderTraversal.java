import java.util.List;
import java.util.ArrayList;

class BinaryTreeZigzagLevelOrderTraversal{
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> leftToRight = new ArrayList<List<Integer>>();	
		search(root, 0, leftToRight);
		List<List<Integer>> result = new ArrayList<List<Integer>>();	
		for (int i = 0; i<leftToRight.size(); i ++) {
			List<Integer> temp = leftToRight.get(i);
			
			if (i % 2 == 0) {
				List<Integer> levelOrderTmepEven = new ArrayList<Integer>();
				for (int j = 0; j < temp.size(); j++) {					
					levelOrderTmepEven.add(temp.get(j));					
				}
				result.add(levelOrderTmepEven);
			} else { 
				List<Integer> levelOrderTmepOdd = new ArrayList<Integer>();
				for (int j = temp.size() - 1; j >= 0; j--) {					
					levelOrderTmepOdd.add(temp.get(j));					
				}
				result.add(levelOrderTmepOdd);				
			}
		}
		return result;
	}
	
	private void search(TreeNode root, int level,  List<List<Integer>> result){
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
		BinaryTreeZigzagLevelOrderTraversal bt = new BinaryTreeZigzagLevelOrderTraversal();
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
		
		List result = bt.zigzagLevelOrder(root);
		for (int i =0 ; i<result.size();i++){
			List temp = (ArrayList)result.get(i);		
			for (int j=0; j< temp.size(); j++){				
				System.out.print(temp.get(j));
			}
			System.out.println("");
		}	
	}
}