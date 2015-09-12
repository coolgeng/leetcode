class ClosestBinarySearchTreeValue {
  
  public int closestValue(TreeNode root, double target) {
    int a = root.val;
    TreeNode kid = target < a ? root.left : root.right;
    int b = closestValue(kid, target);
    return Math.abs(a - target) < Math.abs(b - target) ? a : b;
  }
  
  public static void main(String[] args) {
    ClosestBinarySearchTreeValue cb = new ClosestBinarySearchTreeValue();
    System.out.println(cb.closestValue(root, 1.2d));
  }
}