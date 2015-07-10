import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class FourSum {
	private List<Integer> list(int... ns) {
	            List<Integer> l = new ArrayList<Integer>();
	            for (int n : ns) {
	                l.add(n);
	            }
	            return l;
	        }

	        private void twoSum(int[] num, int a, int b, int start, int target,
	                List<List<Integer>> quadruplets) {
	            int low = start;
	            int high = num.length - 1;
	            while (low < high) {
	                int sum = num[low] + num[high];
	                if (sum < target) {
	                    low++;
	                } else if (sum > target) {
	                    high--;
	                } else {
	                    quadruplets.add(list(a, b, num[low], num[high]));
	                    do {
	                        low++;
	                    } while (low < high && num[low] == num[low - 1]);
	                    do {
	                        high--;
	                    } while (low < high && num[high] == num[high + 1]);
	                }
	            }
	        }

	        public List<List<Integer>> fourSum(int[] num, int target) {
	            List<List<Integer>> quadruplets = new ArrayList<List<Integer>>();
	            Arrays.sort(num);
	            for (int i = 0; i < num.length - 3; i++) {
	                if (i != 0 && num[i] == num[i - 1]) {
	                    continue;
	                }
	                for (int j = i + 1; j < num.length - 2; j++) {
	                    if (j != i + 1 && num[j] == num[j - 1]) {
	                        continue;
	                    }
	                    twoSum(num, num[i], num[j], j + 1,
	                            target - num[i] - num[j], quadruplets);
	                }
	            }
	            return quadruplets;
	        }
	
	
	
	public static void main(String[] args) {
		FourSum fs = new FourSum();
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		List<List<Integer>> ans = ts.fourSum(nums);
		
		for(int i = 0 ; i< ans.size(); i ++) {
			List<Integer> temp = (List)ans.get(i);
			for (int j = 0 ; j < temp.size(); j ++) {
				System.out.print("" + temp.get(j));
			}
			System.out.println("");
		}
	}
}