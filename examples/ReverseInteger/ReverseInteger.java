class ReverseInteger{
	public int reverse(int x) {
    if (x == Integer.MIN_VALUE) {
        return 0;
    }
    boolean negative = x < 0;
    if (negative) {
        x = -x;
    }
    int y = 0;
    while (x != 0) {
        int mod = x % 10;
        if (y > (Integer.MAX_VALUE - mod) / 10) {
            // y * 10 + mod > Integer.MAX_VALUE
            return 0;
        }
        y = y * 10 + mod;
        x /= 10;
    }
    return negative ? -y : y;     
	}
	
	public static void main(String[] args) {
		ReverseInteger ri = new ReverseInteger();
		int test1 = 123;
		int test2 = -123;
		System.out.println(ri.reverse(test1));
		System.out.println(ri.reverse(test2));		
	}
}