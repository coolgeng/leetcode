class SearchInRotatedSortedArray{
	public int search(int[] nums, int target) {
		assert nums.length != 0;
		for (int i = 0; i < nums.length; i ++) {
			if (nums[i] == target) {
				return i;
			} else if (i < nums.length - 1 && nums[i] < target && nums[i + 1] < nums[i]){
				return -1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		SearchInRotatedSortedArray si = new SearchInRotatedSortedArray();
		int target = 3;		
		int[] nums = {4,5,6,1,2,3};
		System.out.println(si.search(nums, target));
	}
}