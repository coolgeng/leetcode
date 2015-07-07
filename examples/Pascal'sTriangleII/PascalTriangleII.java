import java.util.List;
import java.util.ArrayList;
class PascalTriangleII {
	public List<Integer> getRow(int rowIndex) {
    List<Integer> row = new ArrayList<Integer>();
    for (int r = 0; r <= rowIndex; r++) {
        for (int j = r - 1; j >= 1; j--) {
					System.out.println(row.get(j - 1));
					System.out.println(row.get(j));
            row.set(j, row.get(j - 1) + row.get(j));
        }
        row.add(1);
    }
    return row;
	}
	
	
	public static void main(String[] args) {
		PascalTriangleII pt = new PascalTriangleII();
		List result = pt.getRow(3);
		for (int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i));
		}
	}
}