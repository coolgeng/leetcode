class BestTimetoBuyandSellStock2 {
	public int maxProfit(int[] prices) {
      if (prices == null || prices.length == 0) return 0;

      int maxProfit = 0;
      int minValue = prices[0];
      for (int i = 1; i < prices.length; i ++) {
				maxProfit = Math.max(maxProfit, prices[i] - minValue);
				minValue = Math.min(minValue, prices[i]);
      }
      return maxProfit;
	}
			
	public static void main(String[] args) {
		BestTimetoBuyandSellStock bs = new BestTimetoBuyandSellStock();
		int[] prices = {1,2,3,4,5};
		System.out.println(bs.maxProfit(prices));
	}
}

local[i][j] = max(global[i-1][j-1] + max(diff,0), local[i-1][j]+diff)
global[i][j] = max(local[i][j], global[i-1][j])