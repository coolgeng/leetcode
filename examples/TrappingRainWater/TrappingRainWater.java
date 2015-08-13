class TrappingRainWater {
	public int trap(int[] height) {
	  if (height == null || height.length == 0)  
            return 0;  
          
        int i, max, total = 0;
        int left[] = new int[height.length];
        int right[] = new int[height.length];  
  
        // from left to right
        left[0] = height[0];
        max = height[0];
        for (i = 1; i < height.length; i++) {  
            left[i] = Math.max(max, height[i]);
            max = Math.max(max, height[i]);
        }  
  
        // from right to left
        right[height.length-1] = height[height.length-1];
        max = height[height.length-1];
        for (i = height.length-2; i >= 0; i--) {  
            right[i] = Math.max(max, height[i]);
            max = Math.max(max, height[i]);
        }  
  
        // trapped water (when i==0, it cannot trapped any water)
        for (i = 1; i < height.length-1; i++) { 
					  System.out.println("left[" + i + "] is: " + left[i]); 
					  System.out.println("right[" + i + "] is: " + right[i]); 						
            int bit = Math.min(left[i], right[i]) - height[i];  
            if (bit > 0)  
                total += bit;  
        }  
  
        return total;  	
	}
	
	public static void main(String[] args) {
		TrappingRainWater tr = new TrappingRainWater();
		int[] input = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(tr.trap(input));
	}
}