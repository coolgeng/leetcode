class RotateArray {
	private void reverse(int[] nums, int begin, int end) {
	            while (begin < end) {
	                int temp = nums[begin];
	                nums[begin] = nums[end];
	                nums[end] = temp;
	                begin++;
	                end--;
	            }
	        }

	        public void rotate(int[] nums, int k) {
	            k = k % nums.length;
	            reverse(nums, 0, nums.length - 1);
	            reverse(nums, 0, k - 1);
	            reverse(nums, k, nums.length - 1);
	        }
	
	public static void main(String[] args) {
		RotateArray ra = new RotateArray();
		int[] nums = {1,2,3,4,5,6,7,8};
		ra.rotate(nums, 3);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);	
		}
		
	}
}