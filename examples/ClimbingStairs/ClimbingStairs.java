class ClimbingStairs{
	public int climbStairs(int n) {
      int f1 = 1;
      int f2 = 1;
      for (int i = 2; i <= n; i++) {
          int temp = f1 + f2;
          f1 = f2;
          f2 = temp;
      }
      return f2;
  }
	public static void main(String[] args) {
		ClimbingStairs cs = new ClimbingStairs();		
		System.out.println(cs.climbStairs(4));	
		System.out.println(cs.climbStairs(5));
		System.out.println(cs.climbStairs(6));
		System.out.println(cs.climbStairs(7));						
	}
}