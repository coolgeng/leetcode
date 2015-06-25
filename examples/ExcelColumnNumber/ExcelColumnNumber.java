class ExcelColumnNumber{
  public int titleToNumber(String s) {
             int n = 0;
             for (int i = 0; i < s.length(); i++) {
                 char c = s.charAt(i);
                 n = n * 26 + c - 'A' + 1;
             }
             return n;
  }
	
	public static void main(String[] args) {
		ExcelColumnNumber ecn = new ExcelColumnNumber();
		System.out.println(ecn.titleToNumber("AA"));
	}
}