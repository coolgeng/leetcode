import java.util.ArrayDeque;

class EvaluateReversePolishNotation {
	public int evalRPN(String[] tokens) {
		ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
    for (String token : tokens) {
        if (token.equals("+")) {
            int num2 = stack.removeLast();
            int num1 = stack.removeLast();
            stack.offerLast(num1 + num2);
        } else if (token.equals("-")) {
            int num2 = stack.removeLast();
            int num1 = stack.removeLast();
            stack.offerLast(num1 - num2);
        } else if (token.equals("*")) {
            int num2 = stack.removeLast();
            int num1 = stack.removeLast();
            stack.offerLast(num1 * num2);
        } else if (token.equals("/")) {
            int num2 = stack.removeLast();
            int num1 = stack.removeLast();
            stack.offerLast(num1 / num2);
        } else {
            stack.offerLast(Integer.parseInt(token));
        }
    }
    return stack.removeLast();
	}	
	
	public static void main(String[] args) {
		EvaluateReversePolishNotation er = new EvaluateReversePolishNotation();
		String[] tokens1 = {"2", "1", "+", "3", "*"};
		String[] tokens2 = {"4", "13", "5", "/", "+"};
		System.out.println(er.evalRPN(tokens1));
		System.out.println(er.evalRPN(tokens2));		
	}
}