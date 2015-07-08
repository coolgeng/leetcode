import java.util.Stack;
import java.util.HashMap;

class ValidParentheses {
  HashMap<Character, Character> pairs = new HashMap<Character, Character>();
 	    {
 	            pairs.put('(', ')');
 	            pairs.put('[', ']');
 	            pairs.put('{', '}');
 	    }
        
 	    public boolean isValid(String s) {

 	        if (s == null || s.length() == 0) {return true;}
 	        if (s.length() == 1) {
 	            return false;
 	        }
					
 	        Stack stack = new Stack();        
        
 	        for (int i = 0 ; i < s.length(); i ++) {
 						if (!stack.empty()) {
 							if (pairs.get(stack.peek()) == s.charAt(i)) {
 								stack.pop();
 							} else if (pairs.containsKey(s.charAt(i))) {
 								stack.push(s.charAt(i));
 							} else {
 							    return false;
 							}
 						} else {
 							if (pairs.containsKey(s.charAt(i))) {
 								stack.push(s.charAt(i));
 							} else {
 								return false;
 							}
 						}
						
 	        }
        
 	        if (stack.empty()) {return true;}
 	        return false;
        
 	}
	public static void main(String[] args) {
		ValidParentheses vp = new ValidParentheses();
		System.out.println(vp.isValid("([)]"));
		System.out.println(vp.isValid("()[]"));
		System.out.println(vp.isValid("([{}()[]])"));
	}
}