class ExcelColumnTitle{
	public String convertToTitle(int n) {
	        StringBuilder builder = new StringBuilder();
	            while (n != 0) {
	                n--;
	                char c = (char) (n % 26 + 'A');
	                builder.append(c);
	                n /= 26;
	            }
	            return builder.reverse().toString();
	    }
			
	public static void main(String[] args) {
		ExcelColumnTitle ect = new ExcelColumnTitle();		
		System.out.println(ect.convertToTitle(28));
	}
}