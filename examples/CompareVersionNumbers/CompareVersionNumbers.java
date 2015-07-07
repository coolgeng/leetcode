class CompareVersionNumbers {
	public int compareVersion(String version1, String version2) {
    String[] splits1 = version1.split("\\.");
    String[] splits2 = version2.split("\\.");
		
		int i = 0;
		for (;i < splits1.length && i < splits2.length; i++) {
			int v1 = Integer.parseInt(splits1[i]);
			int v2 = Integer.parseInt(splits2[i]);
			if (v1 > v2 ) {
				return 1;
			} else if ( v1 < v2) {
				return -1;
			} 
		}
		
		if (i==splits1.length){
			for (int j=i; j<splits2.length; j++){
				if (Integer.parseInt(splits2[j])!=0){
					return -1;
				}
			}
		}
		
		if (i==splits2.length){
			for (int j=i; j<splits1.length; j++){
				if (Integer.parseInt(splits1[j])!=0){
					return 1;
				}
			}			
		}
		return 0;
	}
			
	public static void main(String[] args) {
		CompareVersionNumbers cv = new CompareVersionNumbers();
		String version1 = "1.2.4";
		String version2 = "1.2.4";
		String version3 = "1.2.5";
		String version4 = "1.2";
				
		System.out.println(cv.compareVersion(version1, version2));
		System.out.println(cv.compareVersion(version1, version3));		
		System.out.println(cv.compareVersion(version3, version1));
		System.out.println(cv.compareVersion(version4, version1));
		System.out.println(cv.compareVersion(version1, version4));		
	}
}