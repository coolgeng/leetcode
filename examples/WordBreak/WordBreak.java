class WordBreak {
	public boolean wordBreak(String s, Set<String> dict) {
		
	}
	
	public static void main(String[] args) {
		WordBreak wb = new WordBreak();
		String s = "lintcode";
		String[] dict = {"lint", "code"};
		System.out.println(wb.wordBreak(s, dict));
	}
}