class TrieNode {
	private TrieNode[] children = new TrieNode[26];
	private boolean end;
	
	private TrieNode getChild(char c){		
		return children[c - 'a'];
	}
	
	private TrieNode getOrCreateNode(char c) {
		if (children[c - 'a'] == null) {
			children[c - 'a'] = new TrieNode();
		}
		return children[c - 'a'];
	}
	
	public void insert(int start, String word) {
		if (start == word.length()) {
			end = true;
		} else {
			TrieNode child = getOrCreateNode(word.charAt(start));
			child.insert(start + 1, word);
		}
	}
	
	public boolean search(int start, String word) {
		if (start == word.length()) {
			return end;
		}
		char c  = word.charAt(start);
		TrieNode child = null;
		if (c != '.') {
			child = getChild(word.charAt(start));			
			if (child!=null) {
				return child.search(start+1, word);
			}				
		} else {
			boolean flag = false;
			for (TrieNode node : children) {				
				if (node != null && node.search(start + 1, word)) {
					flag =true;
					break;
				}
			}
			if (flag) {
				return true;
			} else {
				return false;				
			}
		}		
		
		return false;
	}
	
}