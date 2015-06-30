class MergeSortedArray{
	public void merge(int A[], int m, int B[], int n) {
      int i = m - 1;
      int j = n - 1;
      while (i >= 0 && j >= 0) {
          A[i + j + 1] = A[i] > B[j] ? A[i--] : B[j--];
      }
      while (j >= 0) {
          A[j] = B[j--];
      }
  }
					
	public static void main(String[] args) {
		MergeSortedArray msa = new MergeSortedArray();
		int[] a = new int[] {1,2,4,6,7};
		int m = 5;
		int[] b = {3,5,8,9};
		int n = 4;
		msa.merge(a,m,b,n);
		for (int i = 0; i<m ; i++) {
			System.out.println(a[i]);			
		}

	}
}