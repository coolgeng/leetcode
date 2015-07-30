import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Subsets2 {
	public List<List<Integer>> subsetsWithDup(int[] nums) {
		Arrays.sort(nums);
		
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		List<List<Integer>> prev = new ArrayList<List<Integer>>();
		
		for (int i = nums.length - 1; i >= 0 ; i --) {
			if (i == nums.length - 1 || nums[i] != nums[i + 1] || prev.size() == 0) {
				prev = new ArrayList<List<Integer>>();
				for (int j = 0; j < ans.size() ; j ++) {
					prev.add(new ArrayList<Integer>(ans.get(j)));
				}
			}
			
			for (List<Integer> temp: prev) {
				temp.add(0, nums[i]);
			}
			
			if (i == nums.length - 1 || nums[i] != nums[i+1]) {
				List<Integer> temp = new ArrayList<Integer>();
				
				temp.add(nums[i]);
				prev.add(temp);
			}
			
			for (List<Integer> list: prev) {
				ans.add(new ArrayList<Integer>(list));
			}			
		}
		
		ans.add(new ArrayList<Integer>());
		
		return ans;
	}
			
			
	public static void main(String[] args) {
		Subsets2 s2 = new Subsets2();
		int[] nums = {1,1};
		List<List<Integer>> ans = s2.subsetsWithDup(nums);
		
		for(int i = 0 ; i< ans.size(); i ++) {
			List<Integer> temp = (List)ans.get(i);
			for (int j = 0 ; j < temp.size(); j ++) {
				System.out.print("" + temp.get(j));
			}
			System.out.println("");
		}
	}
}