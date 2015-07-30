import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

class BasicCalculator{
	public int calculate(String s) {
		if (s == null) return 0;
		s = s.replaceAll(" ", "");
		if (s.length() == 0 ) return 0;
				
		char[] arr =  s.toCharArray();
		Stack<String> stack = new Stack<String>();
		
		StringBuilder sb = new StringBuilder("");
		int result = 0 ;
		
		for (int i = 0 ; i < arr.length; i ++) {
			if (arr[i] >= '0' && arr[i] <= '9') {
				sb.append(arr[i]);
				
				if ( i == arr.length - 1) {
					stack.push(sb.toString());
				}
			} else {
				if (sb.length() > 0) {
					stack.push(sb.toString());
					sb = new StringBuilder("");
				}
				
				if (arr[i] != ')') {
					stack.push(new String(new char[] {arr[i]}));
				} else {
					List<String> t = new ArrayList<String>();
					while (!stack.empty()) {
						String top = stack.pop();
						if (top.equals("(")) {
							break;
						} else {
							t.add(0, top);
						}
					}
					int temp = 0;
					if (t.size() == 1 ) {
						temp = Integer.valueOf(t.get(0));
					} else {
						for (int j = t.size() - 1; j > 0 ; j = j -2) {
							if (t.get(j - 1).equals("-")) {
								temp += 0 - Integer.valueOf(t.get(j));
							} else {
								temp += Integer.valueOf(t.get(j));
							}
						}
						temp += Integer.valueOf(t.get(0));
					}
					stack.push(String.valueOf(temp));
				}
			}
			
		}
		
		ArrayList<String> t = new ArrayList<String>();
			while (!stack.isEmpty()) {
				String elem = stack.pop();
				t.add(0, elem);
			}
 
			int temp = 0;
			for (int i = t.size() - 1; i > 0; i = i - 2) {
				if (t.get(i - 1).equals("-")) {
					temp += 0 - Integer.valueOf(t.get(i));
				} else {
					temp += Integer.valueOf(t.get(i));
				}
			}
			temp += Integer.valueOf(t.get(0));
 
			return temp;
	}
	
	public static void main(String[] args) {
		BasicCalculator bc = new BasicCalculator();
		String str1 = "1+1";
		String str2 = "1+(1+(2-3)-4)";
		System.out.println(bc.calculate(str1));
		System.out.println(bc.calculate(str2));		
	}
}