class PalindromePartitioningII {
	private boolean isPalindrome(String s){
		for (int i = 0; i < s.length()/ 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
	
	
	public int minCut(String s) {
		int ans = 0;
		if (isPalindrome(s)) {
			return ans;
		}			
	}
	
	public static void main(String[] args) {
		PalindromePartitioningII pp = new PalindromePartitioningII();
		String s = "aab";
		System.out.println(pp.minCut(pp));
	}
}