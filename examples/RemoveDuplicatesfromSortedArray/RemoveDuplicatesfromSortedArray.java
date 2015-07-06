class RemoveDuplicatesfromSortedArray{
	public int removeDuplicates(int[] nums) {
      assert nums != null;
          if (nums.length == 0) {
              return 0;
          }
          int len = 1;
          for (int i = 1; i < nums.length; i++) {
              if (nums[len - 1] != nums[i]) {
                  nums[len++] = nums[i];
              }
          }
          return len;
  }
			
	public static void main(String[] args) {
		RemoveDuplicatesfromSortedArray rd = new RemoveDuplicatesfromSortedArray();
		int[] nums = {1,1,1,1,1,2,3,3,4,5,5};
		// rd.removeDuplicates(nums);
		System.out.println(rd.removeDuplicates(nums));
		// for (int i=0;i<nums.length;i++){
		// 	System.out.println(nums[i]);
		// }
	}
}