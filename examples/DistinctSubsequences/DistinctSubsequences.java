class DistinctSubsequences {
	public int numDistinct(String S, String T) {
		int[][] dp = new int[S.length() + 1][T.length() + 1];
        dp[0][0] = 1;//initial
        
        for(int j = 1; j <= T.length(); j++)//S is empty
            dp[0][j] = 0;
            
        for (int i = 1; i <= S.length(); i++)//T is empty
            dp[i][0] = 1;
           
        for (int i = 1; i <= S.length(); i++) {
            for (int j = 1; j <= T.length(); j++) {
                dp[i][j] = dp[i - 1][j];
                if (S.charAt(i - 1) == T.charAt(j - 1)) 
                    dp[i][j] += dp[i - 1][j - 1];
            }
        }
     	
     	for (int i  = 0; i <= S.length() ; i ++) {
     		for (int j = 0 ; j <= T.length(); j ++) {
     			System.out.print(dp[i][j]);
     		}
     		System.out.println("");
     	}
        return dp[S.length()][T.length()];
	}

	public static void main(String[] args) {
		DistinctSubsequences ds = new DistinctSubsequences();
    System.out.println(ds.numDistinct("rabbbit","rabbit"));
	}
}