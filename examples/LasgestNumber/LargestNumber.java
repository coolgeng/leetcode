import java.util.Arrays;
import java.util.Comparator;
class LargestNumber{
	// Solution 1
	// public String largestNumber(int[] nums) {
// 		int[] max = new int[nums.length];
// 		for (int i = 0; i < nums.length; i ++) {
// 			for (int j = i + 1; j < nums.length; j ++) {
// 				long p = Long.valueOf(String.valueOf(nums[i]) + String.valueOf(nums[j]));
// 				long q = Long.valueOf(String.valueOf(nums[j]) + String.valueOf(nums[i]));
// 				// System.out.println(p);
// 				// System.out.println(q);
// 				if (p > q) {
// 					int temp = nums[j];
// 					nums[j] = nums[i];
// 					nums[i] = temp;
// 					max[i] = nums[i];
// 				}
// 			}
// 			max[i] = nums[i];
// 		}
// 		StringBuilder sb = new StringBuilder("");
// 		for (int i = max.length - 1; i >=0 ; i --) {
// 			sb.append(max[i]);
// 		}
// 		return sb.toString();
// 	}
	
private int skipLendingZeros(String s) {
            int i = 0;
            for (; i < s.length(); i++) {
                if (s.charAt(i) != '0') {
                    return i;
                }
            }
            return i;
        }

        public String largestNumber(int[] num) {
            String[] nums = new String[num.length];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = Integer.toString(num[i]);
            }
            Arrays.sort(nums, new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    return -(s1 + s2).compareTo(s2 + s1);
                }
            });
            StringBuilder builder = new StringBuilder();
            boolean skip = true;
            for (String n : nums) {
                if (skip) {
                    int start = skipLendingZeros(n);
                    if (start != n.length()) {
                        skip = false;
                        builder.append(n, start, n.length());
                    }
                } else {
                    builder.append(n);
                }
            }
            String r = builder.toString();
            return r.isEmpty() ? "0" : r;
        }
	
	public static void main(String[] args) {
		LargestNumber ln = new LargestNumber();
		int[] nums = {3, 30, 34, 5, 9};
		int[] nums = {26,33,19,29,61,66,52,37,7,76,89,93,72,2,82,11,9,41,47,76,80,28,86,30,99,25,99,85,96,98,88,33,4,94,25,80,19,55,82,71,29,61,15,2,57,98,15,91,27,95,47,38,66,2,78,26,77,33,23,90,73,27,20,5,38,23,35,29,13,46,6,71,58,37,89,28,8,1,8,73,81,83,77,22,63,36,62,89,94,43,25,86,53,21,94,9,40,19,24,21};
		System.out.println(ln.largestNumber(nums));
	}
}