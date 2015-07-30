class FindPeakElement {
	public int findPeakElement(int[] nums) {
		assert nums.length != 0;
    for (int i = 0; i < nums.length - 1; i++) {
        if (nums[i] > nums[i + 1]) {
            return i;
        }
    }
    return nums.length - 1;
	}
	
	public static void main(String[] args) {
		FindPeakElement fp = new FindPeakElement();
		int[] nums = {1,2,3,1};
		System.out.println(fp.findPeakElement(nums));
	}
}