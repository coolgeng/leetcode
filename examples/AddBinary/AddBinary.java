class AddBinary {
	public String addBinary(String a, String b) {
		int i = a.length() - 1;
		int j = b.length() - 1;
		int carry = 0;
		StringBuilder sb = new StringBuilder();
		while (i >= 0 || j >= 0 || carry >0) {
			int valueA = i < 0 ? 0 : a.charAt(i) - '0';
			int valueB = j < 0 ? 0 : b.charAt(j) - '0';
			sb.append((valueA + valueB + carry) % 2);
			carry = (valueA + valueB + carry) / 2;
			i -- ;
			j --;
		}
		return sb.reverse().toString();
	}
	
	public static void main(String[] args) {
		
	}
}