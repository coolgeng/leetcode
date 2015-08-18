import java.util.*;
class WordBreak {
	public boolean wordBreak(String s, Set<String> dict) {
		assert s.length() != 0;
		boolean[] dp = new boolean[s.length()+1];
		dp[0] = true;
		for (int i = 1; i <= s.length() ; i ++) {
			dp[i] = false;
			for (int j = 0 ; j < i ; j ++) {
				if (dp[j] && dict.contains(s.substring(j,i))) {
					dp[i] = true;
					break;
				}
			}
		}
		return dp[s.length()];
	}
	
	public static void main(String[] args) {
		WordBreak wb = new WordBreak();
		String s = "lintcodexyc";
		Set<String> dict = new HashSet<String>();
		dict.add("lint");
		dict.add("code");
		dict.add("xyc");		
		System.out.println(wb.wordBreak(s, dict));
	}
}