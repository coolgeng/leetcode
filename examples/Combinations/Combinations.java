class Combinations{
	public List<List<Integer>> combine(int n, int k) {
      if (n < k) return null;
			List<List<Integer>> ans = new ArrayList<List<Integer>>();
			
			if (n == k ) {
				List<Integer> temp = new ArrayList<Integer>();
				for (int i = 0 ; i < n ; i++ ) {
					temp.add(i);
				}				
				return ans.add(temp);
			}
			
			
			
	}
	
	public static void main(String[] args) {
		Combinations c = new Combinations();
		List<List<Integer>> ans = c.combine();
		
		for(int i = 0 ; i< ans.size(); i ++) {
			List<Integer> temp = (List)ans.get(i);
			for (int j = 0 ; j < temp.size(); j ++) {
				System.out.print("" + temp.get(j));
			}
			System.out.println("");
		}
		
	}
}