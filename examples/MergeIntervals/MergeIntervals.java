import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MergeIntervals{
	
  
  
	public static void main(String[] args) {
		
		List<Interval> intervals = new ArrayList<Interval>();
		
		Interval in1 = new Interval(1,4);
		Interval in2 = new Interval(2,5);
		intervals.add(in2);		
		intervals.add(in1);
		
	  Collections.sort(intervals, new Comparator<Interval>() {

	     @Override
	     public int compare(Interval i1, Interval i2) {
	         if (i1.start == i2.start) {
	             return i1.end - i2.end;
	         }
	         return i1.start - i2.start;
	     }

	   });
		 
		 for (Interval interval : intervals) {
			 System.out.println(interval.toString());
		 }
	}		
}



