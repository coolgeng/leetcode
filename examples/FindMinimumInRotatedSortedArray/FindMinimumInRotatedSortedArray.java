class FindMinimumInRotatedSortedArray {
	public int findMin(int[] nums) {
		assert nums.length != 0;
		for(int i = 0; i < nums.length - 1; i ++) {
			if (nums[i] > nums[i + 1]) {
				return nums[i + 1];
			}
		}
		return nums[0];
	}
	
	public static void main(String[] args) {
		FindMinimumInRotatedSortedArray fi = new FindMinimumInRotatedSortedArray();
		int[] nums = {4, 5, 6, 7,0, 1, 2};
		System.out.println(fi.findMin(nums));
	}
}