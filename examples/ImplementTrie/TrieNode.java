class TrieNode {
	private TrieNode[] children = new TrieNode[26];
	private boolean end = false; 

	public TrieNode(){			
		
	}

	private TrieNode getChild(char c) {
		return children[c - 'a'];
	}

	private TrieNode getOrCreateChild(char c) {
		if (children[c - 'a'] == null) {
			children[c - 'a'] = new TrieNode();
		}
		return children[c - 'a'];
	}

	public void insert(int start, String word){
		if (start == word.length()) {
			end = true;
		} else {
			TrieNode child = getOrCreateChild(word.charAt(start));
			child.insert(start + 1, word);
		}
	}

	public boolean search (int start, String word, boolean prefixSearch){
		if (start == word.length()) {
			return end || prefixSearch;
		}
		TrieNode child = getChild(word.charAt(start));
		if (child!=null) {
			return child.search(start + 1, word, prefixSearch);
		} 
		return false;
	}
}