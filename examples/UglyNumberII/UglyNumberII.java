class UglyNumberII{
  
  public int nthUglyNumber(int n) {    
    int[] ugly = new int[n];
    int idx2 = 0;
    int idx3 = 0;
    int idx5 = 0;
    ugly[0] = 1;
    for (int i = 1; i < n ; i ++) {
      int min = minOf(ugly[idx2] * 2, ugly[idx3] * 3, ugly[idx5] * 5);
      if (min == ugly[idx2] * 2) {idx2 ++;}
      if (min == ugly[idx3] * 3) {idx3 ++;}
      if (min == ugly[idx5] * 5) {idx5 ++;}            
      ugly[i] = min;      
    }
    return ugly[n - 1];
  }
  
  private int minOf(int a, int b, int c) {
    int temp = a < b ? a : b;
    return temp < c ? temp : c;
  }
  
  public static void main(String[] args) {
    UglyNumberII un = new UglyNumberII();
    System.out.println(un.nthUglyNumber(3));
  }
}