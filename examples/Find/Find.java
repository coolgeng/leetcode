import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashMap;

class Find {
	public List<Character> findChar(String str){
		int[] count = new int[str.length()];
		int maxCount = 0;
		char[] arr = str.toCharArray();
		char prev = 0;
		for (int i = 0; i < arr.length ; i ++) {
		   if (prev == 0)	{
		   	 count[0] = 1;
				 prev = arr[i];
				 maxCount = 1;
		   } else {
		   	 if (prev == arr[i]) {
		   	 	 count[i] = count[i-1] + 1;
					 maxCount = Math.max(maxCount, count[i]);
		   	 } else {
		   	 	 count[i] = 1;
					 prev = arr[i];
		   	 }
		   }
		}
		
		List<Character> ans = new ArrayList<Character>();
		for (int i = 0; i < count.length; i ++) {
			if (count[i] == maxCount) {
				ans.add(arr[i]);
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		Find f = new Find();
		List ans = f.findChar("this");
		for (int i=0;i<ans.size();i++) {
			System.out.println(ans.get(i));
		}
	}
}