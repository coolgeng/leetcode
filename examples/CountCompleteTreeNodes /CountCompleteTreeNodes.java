class CountCompleteTreeNodes  {
  public int height(TreeNode root){
    return root == null ? -1 : 1 + height(root.left);
  }
  
  public static void main(String[] args) {
    CountCompleteTreeNodes cc = new CountCompleteTreeNodes();
    TreeNode tn = new TreeNode(1);
    System.out.println(cc.height(tn));
    System.out.println(1<<8);
  }
}