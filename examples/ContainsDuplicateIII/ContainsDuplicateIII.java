import java.util.TreeSet;

class ContainsDuplicateIII {
	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		if (k < 1 || t < 0) return false; 
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		for (int i = 0 ; i < nums.length;  i++) {
			int n = nums[i];
			if (set.floor(n) != null && n <= t + set.floor(n) || set.ceiling(n) !=null && set.ceiling(n) - n <= t) {
				return true;
			}
			set.add(n);
			if (i >= k) {
				set.remove(nums[i - k]);
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		ContainsDuplicateIII cd = new ContainsDuplicateIII();
		int[] nums = {1,3,1};
		int k = 1;
		int t = 1;
		System.out.println(cd.containsNearbyAlmostDuplicate(nums, k , t));
	}
}