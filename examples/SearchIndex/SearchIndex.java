import java.util.*;

class SearchIndex {
	public List<Integer> searchArray(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();		
		if (arr ==null || arr.length == 0) return list;
		for (int i = 0; i < arr.length ; i ++) {
			if (i == arr[i]) {
				list.add(i);
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		SearchIndex si = new SearchIndex();
		int[] arr = {0,1,2,3,5};
		List<Integer> result = si.searchArray(arr);
		for(Integer i : result) {
			System.out.println(i);
		}
	}
}