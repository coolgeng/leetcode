import java.util.*;

class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> result = new ArrayList<List<String>>();
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		for (String str: strs){
			String key = "";
			char[] arr = str.toCharArray();
			Arrays.sort(arr);
			key = String.valueOf(arr);
			if (!map.containsKey(key)) {
				List<String> list  = new ArrayList<String>();
				map.put(key, list);
			}
			map.get(key).add(str);
		}
		for (String key: map.keySet()){
			List<String> list = map.get(key);
			Collections.sort(list);
			result.add(list);
		}
		return result;
	}

	public static void main(String[] args) {
		GroupAnagrams ga = new GroupAnagrams();
	}
}