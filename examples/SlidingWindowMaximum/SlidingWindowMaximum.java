import java.util.*;
class SlidingWindowMaximum {
  public int[] maxSlidingWindow(int[] nums, int k) {
          if (nums == null || k ==0) {return new int[0];}
          int n = nums.length;
          int[] r = new int[n -k + 1];
          int j = 0;
          Deque<Integer> q = new ArrayDeque<Integer>();
          for (int i  = 0 ; i < n ; i ++) {
              while(!q.isEmpty()&& q.peek() < i- k + 1) {
                  q.poll();
              }
              while(!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
                  q.pollLast();
              }
              q.offer(i);
              if (i >= k -1) {
                  r[j ++] = nums[q.peek()];
              }
          }
          return r;
      }
  
  
  public static void main(String[] args) {
     // Deque<Integer> q = new ArrayDeque<>();
//      q.offer(1);
//      q.offer(2);
//      q.offer(3);
//      q.offer(4);
//      q.offer(5);
//      q.offer(6);
//      // q.poll();
//      // q.pollLast();
//      System.out.println(q.peek());
//      for (int i : q) {
//        System.out.println(i);
//      }
     // int[] a = {1,3,-1,-3,5,3,6,7};
     // int k = 3;
     // SlidingWindowMaximum sw = new SlidingWindowMaximum();
     // int[] arr = sw.maxSlidingWindow(a, k);
     // for (int j : arr) {
     //   System.out.print(j);
     // }
  }
}