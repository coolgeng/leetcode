import java.util.List;
import java.util.ArrayList;

class StrobogrammaticNumberII {
	Map<Character,Character> map = new HashMap<Character, Character>();	
	{
		map.put('6','9');
		map.put('9','6');
		map.put('1','1');
		// map.put('0','0');
		map.put('8','8');
	}
	
	private void buildStrobogrammatic(int n, List arr) {
		List<String> temp = new ArrayList<String>();
		if (n > 0) {
			for (String str: arr) {
				StringBuilder sb  = new StringBuilder();
				for (Character ch : map.keySet()) {
					sb.append(ch.toString + str + map.get(ch));
				}
			}
		}
		return;
	}
	
	public List<String> findStrobogrammatic(int n) {
		if (n == 0) return null;		
		List<String> ans = new ArrayList<String>();
		if (n % 2 == 1) {
			for (Character ch : map.keySet()) {
				ans.add(ch.toString());
			}
			n -= 1;
		} 
		
		if (n => 0) {
			buildStrobogrammatic(n, ans);
		}
		
		return ans;		
	}
	
	public static void main(String[] args) {
		StrobogrammaticNumberII sn = new StrobogrammaticNumberII();
		
	}
}