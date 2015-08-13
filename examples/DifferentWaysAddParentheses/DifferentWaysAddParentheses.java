import java.util.List;
import java.util.ArrayList;
class DifferentWaysAddParentheses {
	public List<Integer> diffWaysToCompute(String input) {
		List<Integer> result = new ArrayList<Integer>();
      if (input == null || input.length() == 0) {
          return result;
      }
  
      for (int i = 0; i < input.length(); i++) {
          char c = input.charAt(i);
          if (c != '+' && c != '-' && c != '*') {
              continue;
          }

          List<Integer> part1Result = 
              diffWaysToCompute(input.substring(0, i));
          List<Integer> part2Result = 
              diffWaysToCompute(input.substring(i + 1, input.length()));
      
          for (Integer m : part1Result) {
              for (Integer n : part2Result) {
                  if (c == '+') {
                      result.add(m + n);
                  } else if (c == '-') {
                      result.add(m - n);
                  } else if (c == '*') {
                      result.add(m * n);
                  }
              }
          }
      }
  
      if (result.size() == 0) {
          result.add(Integer.parseInt(input));
      }
  
      return result;
	}
	
	public static void main(String[] args) {
		DifferentWaysAddParentheses dw = new DifferentWaysAddParentheses();
		List<Integer> ans = dw.diffWaysToCompute("1-2+3*4");
		for(Integer input: ans){
			System.out.println(input);
		}
	}
}