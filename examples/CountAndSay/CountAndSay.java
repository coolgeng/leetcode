class CountAndSay {
  
  public String countAndSay(int n) {
    if (n <= 0) return "";
    String curStr = "1";
    int start = 1;
    while (start < n) {
      int count = 1;
      StringBuilder sb = new StringBuilder("");
      for (int j = 1; j < curStr.length(); j ++) {
        if (curStr.charAt(j) == curStr.charAt(j-1)) {
          count ++;
        } else {
          sb.append(count);
          sb.append(curStr.charAt(j-1));
          count = 1;
        }
      }
      sb.append(count);
      sb.append(curStr.charAt(curStr.length() - 1));
      curStr = sb.toString();
      
      start ++;
    }
    return curStr;
  }
  
  public static void main(String[] args) {
    CountAndSay cas = new CountAndSay();
    System.out.println(cas.countAndSay(3));
  }
}
