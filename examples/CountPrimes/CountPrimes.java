class CountPrimes{
	
	public int countPrimes(int n) {
		int count = 0;
  	if (n == 2) {return 1;}
		if (n > 2) {
			for(int i=3;i*i<=n;i+=2) {
			  if(n%i!=0) {
			  	count ++;
			  }
			}			
		}
		return count;
	}
	
	public static void main(String[] args) {
		CountPrimes cp = new CountPrimes();
		System.out.println(cp.countPrimes(5));
	}
}