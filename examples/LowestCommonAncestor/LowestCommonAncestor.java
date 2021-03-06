
public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
			if (root == null) {
			    return null;
	    }

	    if (root.equals(p) || root.equals(q)) { 
	        // if at least one matched, no need to continue
	        // this is the LCA for this root
	        return root;
	    }

	    TreeNode l = lowestCommonAncestor(root.left, p,q);
	    TreeNode r = lowestCommonAncestor(root.right, p, q);

	    if (l != null && r != null) {
	    	return root;  // nodes are each on a seaparate branch
	    }

	    // either one node is on one branch, 
	    // or none was found in any of the branches
	    return l != null ? l : r;	
    }
		
		public static void main(String[] args) {
			LowestCommonAncestor lc = new LowestCommonAncestor();
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
			lvl2_lvl1_left_right.left = lvl3_lvl2_lvl1_left_right_left;
			lvl2_lvl1_left_right.right = lvl3_lvl2_lvl1_left_right_right;
			lvl1_right.left = lvl2_lvl1_right_left;
			lvl1_right.right = lvl2_lvl1_right_right;						
			System.out.println(lc.lowestCommonAncestor(root,lvl1_left,lvl2_lvl1_left_right ).val);
		}
}