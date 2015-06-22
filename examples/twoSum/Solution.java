import java.util.HashMap;


public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] result = new int[2];
 
		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(numbers[i])) {
				int index = map.get(numbers[i]);
				if (index < i) {
					result[0] = index+1 ;
					result[1] = i+1;
					break;
				}
			} else {
				map.put(target - numbers[i], i);
			}
		} 
		return result;
    }		
	
		
	public static void main(String[] args){
		Solution solution = new Solution();
		int[] input = new int[10];
		for (int i=0; i< 10; i++) {
			input[i] = i;
      System.out.println(i);
		}
		int[] output = solution.twoSum(input, 6);

		for (int i = 0; i< output.length; i++) {
			System.out.println(output[i]);
		}

	}
}

