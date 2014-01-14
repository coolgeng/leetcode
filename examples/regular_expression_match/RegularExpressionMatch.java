public class RegularExpressionMatch {
	
	public boolean isMatch(String s, String p)  {
		
	}
	
	public static void main(String[] args) {
		RegularExpression regularExpressionMatch = new RegularExpression();
		assert (regularExpressionMatch.isMatch("aa","a"), false);
		assert (regularExpressionMatch.isMatch("aa","aa"), true);
		assert (regularExpressionMatch.isMatch("aaa","aa"), false);
		assert (regularExpressionMatch.isMatch("aa","a*"), true);
		assert (regularExpressionMatch.isMatch("aa",".*"), true);
		assert (regularExpressionMatch.isMatch("ab",".*"), true);		
		assert (regularExpressionMatch.isMatch("aab","c*a*b*"), true);		
	}
	
}
	