import java.util.HashMap;
import java.util.Map;
class RomantoInteger{
	private Map<Character, Integer> symbols = new HashMap<Character, Integer>();
  {
      symbols.put('M', 1000);
      symbols.put('D', 500);
      symbols.put('C', 100);
      symbols.put('L', 50);
      symbols.put('X', 10);
      symbols.put('V', 5);
      symbols.put('I', 1);
  }
					
	public int romanToInt(String s) {
		int num = 0;
		num += symbols.get(s.charAt(s.length() - 1));
		for (int i = s.length() - 2; i >=0 ; i --) {
			int c = symbols.get(s.charAt(i));
			int c_next = symbols.get(s.charAt(i + 1));
			if (c < c_next) {
				num -= c;
			} else {
				num += c;
			}
		}
		return num;
	}
	
	public static void main(String[] args) {
		RomantoInteger rt = new RomantoInteger();
		System.out.println(rt.romanToInt("II"));
	}
}