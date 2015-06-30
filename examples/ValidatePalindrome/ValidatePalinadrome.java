class ValidatePalinadrome{
	public boolean isPalindrome(String s) {	
		assert s != null;
		            int start = 0;
		            int end = s.length() - 1;
		            while (start < end) {
		                if (!Character.isLetterOrDigit(s.charAt(start))) {
		                    start++;
		                } else if (!Character.isLetterOrDigit(s.charAt(end))) {
		                    end--;
		                } else if (Character.toLowerCase(s.charAt(start)) != Character
		                        .toLowerCase(s.charAt(end))) {
		                    return false;
		                } else {
		                    start++;
		                    end--;
		                }
		            }
		            return true;
	}
	
	public static void main(String[] args) {
		ValidatePalinadrome vp = new ValidatePalinadrome();
		String test1 = "A man, a plan, a canal: Panama";
		System.out.println(test1 + "is:" + Boolean.toString(vp.isPalindrome(test1)));		
		String test2 = "race a car";
		System.out.println(test2 + "is:" + Boolean.toString(vp.isPalindrome(test2)));		
	}
}