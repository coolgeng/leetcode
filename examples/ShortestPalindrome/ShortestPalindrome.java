class ShortestPalindrome {
  
  public String shortestPalindrome(String s) {
    int j = 0;
    for (int i = s.length() - 1; i >= 0; i--) {        
       if (s.charAt(i) == s.charAt(j)) { 
         j += 1; 
       }
     }
     if (j == s.length()) { return s; }
     String suffix = s.substring(j);
     System.out.println(j);
     System.out.println(suffix);
     return new StringBuffer(suffix).reverse().toString() + shortestPalindrome(s.substring(0, j)) + suffix;
  }
  
  public static void main(String[] args) {
    ShortestPalindrome sp = new ShortestPalindrome();
    System.out.println(sp.shortestPalindrome("abcdba"));
      // System.out.println("123".substring(1,2));
  }
}