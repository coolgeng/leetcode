class WordSearch {
  public boolean exist(char[][] board, String word) {
		for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board[0].length; j++) {
            if (search(board, i, j, word, 0)) {
                return true;
            }
        }
    }
    return false;
  }
	
	private boolean search(char[][] board, int i, int j, String word,
          int begin) {
      if (begin == word.length()) {
          return true;
      }
      if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) {
          return false;
      }
      if (board[i][j] == '*' || board[i][j] != word.charAt(begin)) {
          return false;
      }
      char c = board[i][j];
      board[i][j] = '*';
      boolean re = search(board, i + 1, j, word, begin + 1)
              || search(board, i - 1, j, word, begin + 1)
              || search(board, i, j + 1, word, begin + 1)
              || search(board, i, j - 1, word, begin + 1);
      board[i][j] = c;
      return re;
  }	
	
	public static void main(String[] args) {
		WordSearch ws = new WordSearch();
		char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		System.out.println(ws.exist(board, "ABCCED"));
		System.out.println(ws.exist(board, "SEE"));		
		System.out.println(ws.exist(board, "ABCB"));		
	}
}