import java.util.Arrays;

class MinimumSizeSubarraySum {
	public int minSubArrayLen(int s, int[] nums) {
		if (nums == null || nums.length ==0 ) return 0;
		int ans = nums.length;
		int i = 0;
		int sum = nums[0];
		for (int j = 0; j < nums.length ;) {
			if ( i == j) {
				if (nums[j] >= s) {
					return 1;
				} else {
					j ++;
					if (j < nums.length) {
						sum = sum + nums[j];
					} else {
						return ans;
					}
				}
			} else {
				if (sum >= s) {
					ans = Math.min(j - i + 1, ans);
					sum = sum - nums[i];
					i ++;
				} else {
					j ++;
					if (j < nums.length) {
						sum = sum + nums[j];
					} else {
						if ( i ==0) {
							return 0;
						} else {
							return ans;
						}
					}
				}
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		MinimumSizeSubarraySum ms = new MinimumSizeSubarraySum();
		int s = 7;
		int[] nums = {2,3,1,2,4,3};
		System.out.println(ms.minSubArrayLen(s, nums));
	}
}