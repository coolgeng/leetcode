import java.util.List;
import java.util.ArrayList;

class Subsets {
	public List<List<Integer>> subsets(int[] nums) {
			Arrays.sort(nums);
		
			List<List<Integer>> ans = new ArrayList<List<Integer>>();		
		
			for (int i = 0 ; i < nums.length; i ++) {
				List<List<Integer>> temp = new ArrayList<List<Integer>>();
			
				for (List<Integer> list: ans) {
					temp.add(new ArrayList<Integer>(list));
				}
			
				for (List<Integer> list: temp) {
					list.add(nums[i]);
				}
			
				List<Integer> single = new ArrayList<Integer>();
				single.add(nums[i]);
				temp.add(single);
			
				ans.addAll(temp);						
			}
		
			ans.add(new ArrayList<Integer>());
		
			return ans;
		}
	
	public static void main(String[] args) {
		Subsets s = new Subsets();
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		// List<List<Integer>> ans = s.subsets(nums);
		
		// for(int i = 0 ; i< ans.size(); i ++) {
	// 		List<Integer> temp = (List)ans.get(i);
	// 		for (int j = 0 ; j < temp.size(); j ++) {
	// 			System.out.print("" + temp.get(j));
	// 		}
	// 		System.out.println("");
	// 	}
	//	
	for (int i = 0 ; i < 1 << 3 ; i ++) {
		System.out.println(i);		
	}

		
	}
}