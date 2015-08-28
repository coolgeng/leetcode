class UglyNumber {
  public boolean isUgly(int num) {
    if (num < 1) {return false;}
    if (num == 1) {return true;}
    for (int i = 2 ; i < 6 && num > 0; i++) {
      while( num % i ==0) {
        num /= i;
      }
    }
    return num == 1;
  }
  
  public static void main(String[] args) {
    
  }
}