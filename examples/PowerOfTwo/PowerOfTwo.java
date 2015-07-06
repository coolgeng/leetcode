class PowerOfTwo{
	
	public boolean isPowerOfTwo(int n) {
	  int count = 0;
	        if(n < 0){
	            return false;
	        }
    
	        while(n != 0){
	            int tmp = n & 1;
	            if(tmp == 1){
	                count++;
	            }
	            n = n >>> 1;
	        }
    
					System.out.println(count);
					
	        if(count == 1){
	            return true;
	        }else{
	            return false;
	        }
	}
	
	public static void main(String[] args) {
		PowerOfTwo po = new PowerOfTwo();
		// System.out.println(po.isPowerOfTwo(13));
		// System.out.println(po.isPowerOfTwo(-1));
		// System.out.println(po.isPowerOfTwo(0));
		System.out.println(po.isPowerOfTwo(64));
	}
}