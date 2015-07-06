class RectangleArea{
	
  public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		if (E>C || A>G) 
			return (G-E)*(H-F) + (C-A)*(D-B) ;
		
		if (F > D || B > H)
			return (G-E)*(H-F) + (C-A)*(D-B) ;			return  ();
		
		int right = Math.min();
		int left = Math.min();
		int top = Math.min();
		int bottom = Math.min();
			return (G-E)*(H-F) + (C-A)*(D-B) - (right - left) * (top - bottom);
  }
	
	
	public static void main(String[] args) {
		System.out.println();
	}
}