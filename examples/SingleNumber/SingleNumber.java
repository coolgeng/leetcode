import java.util.Arrays;
class SingleNumber {	
	public int singleNumber(int[] nums) {
		int ans = 0;
		for (int temp : nums) {
			ans ^= temp;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		SingleNumber sn = new SingleNumber();
		int[] nums = {1,2, 3,1,2};
		System.out.println(sn.singleNumber(nums));
		// System.out.println(0^1^1^2^3^3);
	}
}