import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class ThreeSum{
	
	private List<Integer> makeTriplet(int a, int b, int c) {
	            List<Integer> ans = new ArrayList<Integer>();
	            ans.add(a);
	            ans.add(b);
	            ans.add(c);
	            return ans;
	        }

	        private void twoSum(List<List<Integer>> ans, int a,
	                int[] num, int begin) {
	            int i = begin;
	            int j = num.length - 1;
	            while (i < j) {
	                int sum = num[i] + num[j];
	                if (sum < -a) {
	                    i++;
	                } else if (sum > -a) {
	                    j--;
	                } else {
	                    ans.add(makeTriplet(a, num[i], num[j]));
	                    do {
	                        i++;
	                    } while (i < j && num[i] == num[i - 1]);
	                    do {
	                        j--;
	                    } while (i < j && num[j] == num[j + 1]);
	                }
	            }
	        }

	        public List<List<Integer>> threeSum(int[] num) {
	            Arrays.sort(num);
	            List<List<Integer>> ans = new ArrayList<List<Integer>>();
	            for (int i = 0; i < num.length - 2; i++) {
	                if (i > 0 && num[i] == num[i - 1]) {
	                    continue;
	                }
	                twoSum(ans, num[i], num, i + 1);
	            }
	            return ans;
	        }
	
	public static void main(String[] args) {
		ThreeSum ts = new ThreeSum();
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		List<List<Integer>> ans = ts.threeSum(nums);
		
		for(int i = 0 ; i< ans.size(); i ++) {
			List<Integer> temp = (List)ans.get(i);
			for (int j = 0 ; j < temp.size(); j ++) {
				System.out.print("" + temp.get(j));
			}
			System.out.println("");
		}
	}
}