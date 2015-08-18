public class RegularExpressionMatch {
	
	public boolean isMatch(String s, String p)  {
		boolean[][] dp = new boolean[p.length() + 1][s.length() + 1];
    dp[0][0] = true;
    for (int i = 1; i <= p.length(); i++) {
        dp[i][0] = p.charAt(i - 1) == '*' && dp[i - 2][0];
        for (int j = 1; j <= s.length(); j++) {
            if (p.charAt(i - 1) == '*') {
                if (dp[i - 2][j]) {
                    dp[i][j] = true;
                    continue;
                }
                char prev = p.charAt(i - 2);
                for (int k = j; k > 0; k--) {
                    if (prev != '.' && prev != s.charAt(k - 1)) {
                        break;
                    }
                    if (dp[i - 2][k - 1]) {
                        dp[i][j] = true;
                        break;
                    }
                }
            } else {
                dp[i][j] = dp[i - 1][j - 1]
                        && (p.charAt(i - 1) == '.' || p.charAt(i - 1) == s
                                .charAt(j - 1));
            }
        }

    }
    return dp[p.length()][s.length()];
	}

	
	public static void main(String[] args) {
		RegularExpressionMatch regularExpressionMatch = new RegularExpressionMatch();
		// assert (regularExpressionMatch.isMatch("aa","a"), false);
		// assert (regularExpressionMatch.isMatch("aa","aa"), true);
		// assert (regularExpressionMatch.isMatch("aaa","aa"), false);
		// assert (regularExpressionMatch.isMatch("aa","a*"), true);
		// assert (regularExpressionMatch.isMatch("aa",".*"), true);
		// assert (regularExpressionMatch.isMatch("ab",".*"), true);
		System.out.println (regularExpressionMatch.isMatch("aa","a"));
		System.out.println (regularExpressionMatch.isMatch("aa","aa"));
		System.out.println (regularExpressionMatch.isMatch("aaa","aa"));
		System.out.println (regularExpressionMatch.isMatch("aa","a*"));
		System.out.println (regularExpressionMatch.isMatch("aa",".*"));										
		System.out.println (regularExpressionMatch.isMatch("ab",".*"));
		System.out.println (regularExpressionMatch.isMatch("aab","c*a*b*"));		
	}
	
}
	