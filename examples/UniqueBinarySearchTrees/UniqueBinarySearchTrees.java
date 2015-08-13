class UniqueBinarySearchTrees {
	public int numTrees(int n) {
		if (n == 0) return 1;
		int[] ans = new int[n + 1];
		ans[0] = 1;
		for (int i = 1; i < n + 1 ; i++) {
			for (int j = 0; j <i ; j ++) {
				ans[i] += ans [j] * ans[i - 1- j];
			}
		}
		return ans[n];
	}
	
	public static void main(String[] args) {
		UniqueBinarySearchTrees ub = new UniqueBinarySearchTrees();
		System.out.println(ub.numTrees(3));
	}
}

