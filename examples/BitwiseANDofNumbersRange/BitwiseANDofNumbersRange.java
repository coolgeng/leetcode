class BitwiseANDofNumbersRange{
	public int rangeBitwiseAnd(int m, int n) {
	        int c=0;
	        while(m!=n){
	            m>>=1;
	            n>>=1;
							System.out.println("m is:" + m);
							System.out.println("n is: " + n);							
	            ++c;
	        }
	        return n<<c;
	}
	
	public static void main(String[] args) {
		BitwiseANDofNumbersRange ba = new BitwiseANDofNumbersRange();		
		System.out.println(ba.rangeBitwiseAnd(5,7));
		System.out.println(3 << 1);
	}
}