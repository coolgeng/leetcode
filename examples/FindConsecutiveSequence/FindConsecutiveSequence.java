class FindConsecutiveSequence{
	
	void printLongestSnake(int[][] matrix) {
	  int n = matrix.length;
	  int nSquared = n * n;
	  Coordinate[] positions = new Coordinate[nSquared];
	  for (int i = 0; i < n; ++i) {
	    for (int j = 0; j < n; ++j) {
				System.out.println(matrix[i][j] - 1);
	      positions[matrix[i][j] - 1] = new Coordinate(i, j);
	    }
	  }
	  int maxLength = 1;
	  int maxEnd = 1;
	  int currentLength = 1;
	  for (int i = 1; i < nSquared; ++i) {
	    if (positions[i].isAdjacent(positions[i - 1])) {
	      ++currentLength;
	    } else {
	      if (currentLength > maxLength) {
	        maxLength = currentLength;
	        maxEnd = i;
	      }
	      currentLength = 1;
	    }
	  }
	  if (currentLength > maxLength) {
	    maxLength = currentLength;
	    maxEnd = nSquared;
	  }
	  for (int i = maxEnd - maxLength + 1; i < maxEnd; ++i) {
	    System.out.print(i + " ");
	  }
	  System.out.println(maxEnd);
	}
	
	
	public static void main(String[] args) {
		int[][] input = {{1,5,9},{2,3,8},{4,6,7}};
		FindConsecutiveSequence fc = new FindConsecutiveSequence();		
		fc.printLongestSnake(input);
	}
}

