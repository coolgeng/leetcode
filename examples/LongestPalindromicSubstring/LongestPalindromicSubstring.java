import java.util.*;
class LongestPalindromicSubstring {
  private int maxLen = 1;
  private int maxIndex = 0;
  public String longestPalindrome(String s) {
    int len = s.length();
    for (int i = 0 ; i < len; i ++) {
      findPalindrome(s, len, i, 0);
      findPalindrome(s, len, i, 1);
    } 
    return s.substring(maxIndex, maxIndex + maxLen);
  }
  
  private void findPalindrome(String str, int len, int start, int shift) {
    int left = start;
    int right = start + shift;
    while (left >=0 && right < len && str.charAt(left) == str.charAt(right)) {
      if ((right - left + 1) > maxLen) {
        maxLen = right - left + 1;
        maxIndex = left;
      }
      left -- ;
      right ++;
    }
  }
  
  public static void main(String[] args) {
    LongestPalindromicSubstring lp = new LongestPalindromicSubstring();
    System.out.println(lp.longestPalindrome("abcbcd"));
  }
}