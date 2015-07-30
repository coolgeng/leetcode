import java.util.List;
import java.util.ArrayList;

class PascalTriangleII {
	public List<Integer> getRow(int rowIndex) {
		List<Integer> ans = new ArrayList<Integer>();
		
    for (int r = 0; r <= rowIndex; r++) {
        for (int j = r - 1; j >= 1; j--) {
            ans.set(j, ans.get(j - 1) + ans.get(j));
        }
        ans.add(1);
    }
		return ans;
	}
	
	public static void main(String[] args) {
		PascalTriangleII pt = new PascalTriangleII();		
		for (Integer in : pt.getRow(3)) {
			System.out.print(in);
		}
	}
}