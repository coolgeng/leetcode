import java.util.ArrayList;
import java.util.List;

class PascalTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
    if (numRows == 0) {
        return ans;
    }
    ArrayList<Integer> lastRow = new ArrayList<Integer>();
    lastRow.add(1);
    ans.add(lastRow);
    for (int r = 2; r <= numRows; r++) {
        ArrayList<Integer> row = new ArrayList<Integer>();
        row.add(1);
        for (int j = 1; j <= r - 2; j++) {
            row.add(lastRow.get(j - 1) + lastRow.get(j));
        }
        row.add(1);
        lastRow = row;
        ans.add(lastRow);
    }
    return ans;
	}
	
	public static void main(String[] args) {
		PascalTriangle pt = new PascalTriangle();
		List result = pt.generate(5);
		for(int i =0 ;i<result.size();i++){
			List<Integer> list = (ArrayList)result.get(i);
			for (int j=0;j<list.size();j++) {
				int a = list.get(j);
				System.out.print(" " + a + " ");
			}
			System.out.println("");
		}
	}
}