class MaximumProductSubarray {
	public int maxProduct(int[] nums) {
		assert nums.length != 0;
    int globalMax = nums[0];
    int prevMax = nums[0];
    int prevMin = nums[0];
    for (int i = 1; i < nums.length; i++) {
        int max;
        int min;
        if (nums[i] > 0) {
            max = Math.max(nums[i], prevMax * nums[i]);
            min = Math.min(nums[i], prevMin * nums[i]);
        } else {
            max = Math.max(nums[i], prevMin * nums[i]);
            min = Math.min(nums[i], prevMax * nums[i]);
        }
        globalMax = Math.max(globalMax, max);
        prevMax = max;
        prevMin = min;
    }
    return globalMax;				
	}
		
	
	public static void main(String[] args) {
		MaximumProductSubarray mp = new MaximumProductSubarray();
		int[] nums = {2,3,-2,4};
		System.out.println(mp.maxProduct(nums));
	}
}