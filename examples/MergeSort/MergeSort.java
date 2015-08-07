class MergeSort{
	public int[] sort(int[] arr){
		if (arr.length < 2 || arr == null) {return arr;}		
		return mergeSort(arr, 0, arr.length - 1);
	}
	
	public int[] mergeSort(int[] arr, int start, int end) {
		if (start < end) {
			int mid = (start + end) /2 ;
			int[] left = mergeSort(arr, start, mid);
			int[] right = mergeSort(arr, mid + 1, end);			
			return mergeTwoArray(left, right);
		}
		return new int[0];
	}
	
	public	int[] mergeTwoArray(int[] left, int[] right){
		int[] ans = new int[left.length + right.length];
		int k = 0;
		int i = 0;
		int j = 0;
		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				ans[k] = left[i];
				k ++;
				i ++;
			} else {
				ans[k] = right[j];
				k ++;
				j ++;
			}
		}
		while (i < left.length) {
			ans[k] = left[i];
			i ++;
		}
		while (j < right.length) {
			ans[k] = left[j];
			j ++;			
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int[] input = {3,1,4,5,2,3,7,8};
		MergeSort ms = new MergeSort();
		int[] output = ms.sort(input);
		for (int i = 0; i < output.length ; i ++) {
			System.out.println(output[i]);
		}
	}
}