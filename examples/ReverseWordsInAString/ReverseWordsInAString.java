import java.util.Stack;

class ReverseWordsInAString {
	
	public String reverseWords(String s) {		
		if (s == null || s.trim().length() == 0) return "";
		String[] arr = s.trim().split(" +");
		StringBuilder sb = new StringBuilder("");
		for (int i = arr.length - 1; i >= 0; i --) {
			sb.append(arr[i]);
			if (i != 0) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}
	
	// solution 1
	// public String reverseWords(String s) {
// 		if (s == null || s.trim().length() == 0) return "";
// 		Stack stack = new Stack();
// 		String[] arr = s.trim().split(" +");
// 		for (int i = 0 ; i< arr.length ; i++ ) {
// 			stack.push(arr[i].trim());
// 			if (i != arr.length - 1 ) {
// 				stack.push(" ");
// 			}
// 		}
// 		StringBuilder sb = new StringBuilder("");
// 		while (!stack.empty()) {
// 			sb.append(stack.pop());
// 		}
// 		return sb.toString();
// 	}
	
	public static void main(String[] args) {
		ReverseWordsInAString rw = new ReverseWordsInAString();
		String s = "I am Cooper";
		System.out.println(rw.reverseWords(s));
	}
}