class SingleNumberII {
	public int singleNumber(int[] nums) {
		int ans = 0; 
		for (int i = 0; i< 32; i++) {
			int count  = 0 ;
			for (int j = 0; j < nums.length ; j ++) {
				count += ((nums[j] >> i) & 1);
			}
			ans |= ((count % 3) <<i);
		}
		return ans;
	}
	
	public static void main(String[] args) {
		SingleNumberII sn = new SingleNumberII();
		int[] nums = {1,1,1,2,2,2,3,3,3,4};
		System.out.println(sn.singleNumber(nums));
	}
}