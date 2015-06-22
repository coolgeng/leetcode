import java.util.List;
import java.util.ArrayList;

class HappyNumber {
	List sumSet = new ArrayList();
	
	private  int sumNum(int num) {		
		// char[] chars = ("" + num).toCharArray();
		int sum = 0;
		// System.out.println("sum is: " + String.valueOf(num).toCharArray());
		for (char ch: String.valueOf(num).toCharArray()){
			// System.out.println("char is: " + ch);
			int i = 0;
			i = Character.getNumericValue(ch);		
			sum = i * i + sum;
		}		
		return sum;
	}
	
	public  boolean isHappyNumber(int n) {
		int sum = sumNum(n);
		if (sum == 1) {
			// System.out.println("sum is: " + sum);
			return true;
		} else if (!sumSet.contains(sum)) {
			// System.out.println("sum is: " + sum);
			sumSet.add(sum);
			return isHappyNumber(sum);					
		} 
		return false;
	}
	
	public static void main(String[] args) {
		HappyNumber hn = new HappyNumber();
		System.out.println(hn.isHappyNumber(18));
	}
}