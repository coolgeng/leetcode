import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class TwoSum {
  public int[] twoSum(final int[] numbers, int target) {
		List<Integer> post = new ArrayList<Integer>();
		for (int i = 0 ; i < numbers.length ; i ++) {
			post.add(i);
		}
		
		Collections.sort(post, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return numbers[o1] - numbers[o2];
			}
		});
			
		int i = 0 ;
		int j  = numbers.length - 1;
		while (i < j) {
			int result = numbers[post.get(i)] + numbers[post.get(j)];
			if (result > target) {
				j --;
			} else if (result < target) {
				i ++;
			} else {
				int[] ans = new int[2];
				ans[0] = Math.min(post.get(i), post.get(j)) + 1;
				ans[1] = Math.max(post.get(i), post.get(j)) + 1;	
				return ans;			
			}
			
		}
return null;
	}
	
		
	public static void main(String[] args){
		TwoSum solution = new TwoSum();
		int[] input = new int[10];
		for (int i=0; i< 10; i++) {
			input[i] = i;
      // System.out.println(i);
		}
		int[] output = solution.twoSum(input, 6);

		for (int i = 0; i< output.length; i++) {
			System.out.println(output[i]);
		}

	}
}

