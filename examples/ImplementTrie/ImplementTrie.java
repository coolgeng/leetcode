class ImplementTrie {
	private TrieNode root;

  public Trie() {
      root = new TrieNode();
  }

  // Inserts a word into the trie.
  public void insert(String word) {
    root.insert(0, word);
  }

  // Returns if the word is in the trie.
  public boolean search(String word) {
    return root.search(0, word, false);
  }

  // Returns if there is any word in the trie
  // that starts with the given prefix.
  public boolean startsWith(String prefix) {
    return root.search(0, prefix, true);
  }

	public static void main(String[] args) {
		ImplementTrie it = new ImplementTrie();
		// Your Trie object will be instantiated and called as such:
		// Trie trie = new Trie();
		it.insert("somestring");
		System.out.println(it.search("key"));
		System.out.println(it.startsWith("key"));
	}
}