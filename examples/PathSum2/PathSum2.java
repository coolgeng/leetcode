import java.util.List;
import java.util.ArrayList;

class PathSum2 {
	public List<List<Integer>> pathSum(TreeNode root, int sum) {

		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		
		if (root !=null) {
			search (root, sum, new ArrayList<Integer>(), ans);
		}
		
		return ans;
	}
	
	
	private void search(TreeNode root, int sum, List<Integer> nodes, List<List<Integer>> ans){
		if (root.left == null && root.right == null) {
			if (root.val == sum) {
				List<Integer> temp = new ArrayList<Integer>(nodes);
				temp.add(root.val);
				ans.add(temp);
			}
			return;
		}
		
		nodes.add(root.val);
		if(root.left!=null) {
			search(root.left, sum-root.val, nodes,ans);
		}
		if (root.right!=null) {
			search(root.right, sum - root.val, nodes, ans);			
		}
		nodes.remove(nodes.size() - 1);
	}
	
		
	
	public static void main(String[] args) {
		TreeNode root  = new TreeNode(6);
		TreeNode lvl1_left = new TreeNode(2);
		TreeNode lvl1_right = new TreeNode(8);
		TreeNode lvl2_lvl1_left_left = new TreeNode(0);
		TreeNode lvl2_lvl1_left_right = new TreeNode(4);
		TreeNode lvl2_lvl1_right_left = new TreeNode(7);
		TreeNode lvl2_lvl1_right_right = new TreeNode(9);
		TreeNode lvl3_lvl2_lvl1_left_right_left = new TreeNode(3);
		TreeNode lvl3_lvl2_lvl1_left_right_right = new TreeNode(5);
		root.left = lvl1_left;
		root.right = lvl1_right;
		lvl1_left.left = lvl2_lvl1_left_left;
		lvl1_left.right = lvl2_lvl1_left_right;
		lvl1_right.left = lvl2_lvl1_right_left;
		lvl1_right.right = lvl2_lvl1_right_right;
		
		PathSum2 ps = new PathSum2();		
		for (List list: ps.pathSum(root, 12)) {
			List<Integer> tempList = (List<Integer>) list;
			for (Integer element : tempList ) {
				System.out.print(" " + element + " ");
			}
			System.out.println("");
		}
			
	}
}