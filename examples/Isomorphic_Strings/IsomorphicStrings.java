import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

class IsomorphicStrings {
	public boolean isIsomorphic(String s, String t) {
		Map<Character, Character> mapping = new HashMap<Character, Character>();
		Set<Character> mapped = new HashSet<Character>();
		
		for (int i =0 ;i<s.length(); i++) {
			char c1 = s.charAt(i);
			char c2 = t.charAt(i);
			if (mapping.containsKey(c1)) {
				if (mapping.get(c1)!=c2) {
					return false;
				}
			} else {
				if (mapped.contains(c2)){
					return false;
				}
				mapped.add(c2);
				mapping.put(c1, c2);
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
			IsomorphicStrings is = new IsomorphicStrings();
			System.out.println(is.isIsomorphic("aba", "pap"));
			System.out.println(is.isIsomorphic("aaa", "pap"));			
	}
}