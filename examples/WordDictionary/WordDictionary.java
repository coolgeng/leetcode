class WordDictionary {
	TrieNode root= new TrieNode();
	
  public void addWord(String word) {
		root.insert(0, word);
  }

   // Returns if the word is in the data structure. A word could
   // contain the dot character '.' to represent any one letter.
   public boolean search(String word) {
		 return root.search(0, word);
   }
	 
	 public static void main(String[] args) {
	 	 WordDictionary wd = new WordDictionary();
		 // wd.addWord("ab");
		 wd.addWord("a");
		 wd.addWord("a");
		 System.out.println(wd.search("."));
		 System.out.println(wd.search("a"));
		 System.out.println(wd.search("aa"));
		 System.out.println(wd.search("a"));
		 System.out.println(wd.search(".a"));		 
		 System.out.println(wd.search("a."));		 		 
	 }
}