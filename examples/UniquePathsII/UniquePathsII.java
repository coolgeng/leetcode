class UniquePathsII{
	private void printSingleDiagonal(int[][] matrix) {
		for (int i = 0; i < matrix.length * 2 ; i ++ ) {
			for (int j = 0 ; j <= i; j ++) {
				int t = i - j;
				if (t < matrix.length && j < matrix.length) {
					System.out.print (matrix[t][j] + "");
	}
	}
		System.out.println(""); // change line
	}
}
	
	public static void main(String[] args) {
		UniquePathsII up = new UniquePathsII();
		int[][] test = {{1,2,3},{4,5,6},{7,8,9}};
		up.printSingleDiagonal(test);
	}
}