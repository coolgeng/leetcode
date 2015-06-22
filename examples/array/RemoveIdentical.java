import java.util.List;
import java.util.ArrayList;

class RemoveIdentical {
	
	private static boolean isIdentical(List list, String str) {
		if (str == "2") return true;
		if (str == "3") return true;
		else return false;
	}
	
	private static List<String> listFiles(String directory){	
		List<String> list = new ArrayList<String>();
		list.add("1");	
		list.add("1");
		list.add("3");				
		return list;
	}
	
	private static List<String> detectDuplicate(String directory){
		List<String> fileList = listFiles(directory);
		List<String> uniqueList = new ArrayList<String>();
		for (String fileName: fileList) {
			if(!uniqueList.contains(fileName)) {
				uniqueList.add(fileName);
			}
		}
		return uniqueList;
	}
	
	public static void main(String[] args) {		
		System.out.println("start to print result");
		for(String fileName: detectDuplicate("aaa")) {
			System.out.println("fileName is: " + fileName);
		}
		
	}

}