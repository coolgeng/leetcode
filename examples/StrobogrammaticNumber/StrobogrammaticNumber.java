import java.util.Map;
import java.util.HashMap;

class StrobogrammaticNumber {
	Map<Character,Character> map = new HashMap<Character, Character>();	
	{
		map.put('6','9');
		map.put('9','6');
		map.put('1','1');
		map.put('0','0');
		map.put('8','8');
	}
	
	public boolean isStrobogrammatic(String num) {
		if (num == null || num.length() ==0) return true;
		char[] arr = num.toCharArray();
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {			
			if (map.keySet().contains(arr[i]) && map.get(arr[i]) == arr[j]) {
				i ++;
				j --;
				continue;
			} else {
				return false;
			}
		}
		if (i == j) {
			if (arr[i] == '1' || arr[i] == '0' || arr[i] == '8') {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		StrobogrammaticNumber sn = new StrobogrammaticNumber();
		String num = "25";
		System.out.println(sn.isStrobogrammatic(num));
	}
}