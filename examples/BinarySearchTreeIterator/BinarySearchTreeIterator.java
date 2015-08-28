class BinarySearchTreeIterator {
  Stack<TreeNode> stack  = new Stack<TreeNode>();
  private void pushAll(TreeNode node) {
    for (;node != null; stack.push(node), node = node.left);
  }
  
  public BSTIterator(TreeNode root) {
    pushAll(root);
  }

  /** @return whether we have a next smallest number */
  public boolean hasNext() {
    return !stack.isEmpty();
  }

  /** @return the next smallest number */
  public int next() {
    TreeNode smallest = stack.pop();
    pushAll(smallest.right);
    return smallest.val;
  }
  
  public static void main(String[] args) {
    BinarySearchTreeIterator bs = new BinarySearchTreeIterator();

  }
}