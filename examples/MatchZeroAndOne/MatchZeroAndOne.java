import java.util.List;

class MatchZeroAndOne{
	
	public List<String> match(String str){
		
	}
	
	public static void main(String[] args) {
		String str = "10?0?1";
		MatchZeroAndOne mz = new MatchZeroAndOne();
		List<String> result = mz.match(str);
		for (String str: result) {
			System.out.println(str);
		}
	}
}