import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

class PalindromePartitioning {
	Map<String, List<List<String>>> cache = new HashMap<String, List<List<String>>>();
	
	private boolean isPalindrome(String s) {
		for (int i = 0 ;i < s.length()/ 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 -i)) {
				return false;
			}
		}
		return true;
	}
	
	public List<List<String>> partition(String s) {
		List<List<String>> ans = cache.get(s);
		
		if (ans != null) {
			return ans;
		}
		
		ans = new ArrayList<List<String>>();
		
		for (int i  = 1 ; i < s.length() ; i ++) {
			String prefix = s.substring(0, i);
			if (isPalindrome(prefix)) {
				for (List<String> subbands : partition(s.substring(i))) {
					List<String> temp = new ArrayList<String>();
					temp.add(prefix);
					temp.addAll(subbands);
					ans.add(temp);
				}
			}
		}
		
		if (isPalindrome(s)) {
			List<String> temp = new ArrayList<String>();
			temp.add(s);
			ans.add(temp);
		}
		
		cache.put(s, ans);
		return ans;		
	}
	
	public static void main(String[] args) {
		PalindromePartitioning pp = new PalindromePartitioning();
		String s = "aaabaac";
		List<List<String>> ans = pp.partition(s);
		for (List<String> list: ans) {
			for (String str: list) {
				System.out.print(str + " ");
			}
			System.out.println(" ");
		}
		
		// String str1 = "1234567";
		// System.out.println(str1.substring(1));
		
	}
}