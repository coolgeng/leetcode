class CombinationSumIII{
  public List<List<Integer>> combinationSum3(int k, int n) {
		
  }
	
	public static void main(String[] args) {
		CombinationSumIII cs = new CombinationSumIII();
		List<List<Integer>> ans = cs.combinationSum3(3, 9);
		
		for(int i = 0 ; i< ans.size(); i ++) {
			List<Integer> temp = (List)ans.get(i);
			for (int j = 0 ; j < temp.size(); j ++) {
				System.out.print("" + temp.get(j));
			}
			System.out.println("");
		}
	}
}