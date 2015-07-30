import java.util.Arrays;

class ThreeSumClosest {
  public int threeSumClosest(int[] nums, int target) {		
		if (nums == null || nums.length < 3) return 0;
		
		Arrays.sort(nums);
    int min = Integer.MAX_VALUE ;
		int val = 0;

		for (int i = 0 ; i < nums.length ; i ++) {
			int low =  i + 1;
			int high = nums.length - 1;
			while (low < high) {
				int sum = nums[i] + nums[low] + nums[high];
				
				if (Math.abs(target - sum) < min) {
					min = Math.abs(target - sum);
					val = sum;
				}
					
				if (sum == target) {
					return val;
				} else if (sum < target) {
					low ++ ;
				} else {
					high --;
				}
				
			}
		}
		return val;
  }
	
	public static void main(String[] args) {
		ThreeSumClosest sc = new ThreeSumClosest();
		int[] nums = {1,2,-1,4};
		System.out.println(sc.threeSumClosest(nums , 1));
	}
	
}