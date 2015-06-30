import java.util.ArrayList;
import java.util.List;

class SummaryRanges{
	public List<String> summaryRanges(int[] nums) {
		List<String> list = new ArrayList<String>();
		if (nums.length == 1) {
			list.add(nums[0] + "");
			return list;
		}
		for (int i=0;i<nums.length;i++){
			int a = nums[i];
			while(i+1<nums.length && (nums[i+1] - nums[i] == 1)) {
				i ++;
			}
			if (a == nums[i]){
				list.add(a + "");
			} else {
				list.add(a + "->" + nums[i]);
			}		
		}
		return list;
	}
	
	public static void main(String[] args) {
		SummaryRanges sr = new SummaryRanges();
		int[] nums = {1,2,9,10,13};		
		List<String> result = sr.summaryRanges(nums);		
		for (String str: result){
			System.out.println(str+" ");
		}
	}
}