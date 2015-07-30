class FindMinimumInRotatedSortedArrayII {
	public int findMin(int[] nums) {
		assert nums.length != 0;
		for (int i = 0 ; i < nums.length ; i++) {
			if (i < nums.length - 1 && nums[i] > nums[i + 1]) {
				return nums[i + 1]; 
			}
		}
		return nums[0];
	}
	
	public static void main(String[] args) {
		FindMinimumInRotatedSortedArrayII fm = new FindMinimumInRotatedSortedArrayII();
		int[] nums = {1};
		System.out.println(fm.findMin(nums));
	}
}