import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MergeIntervals{
	
   public List<Interval> merge(List<Interval> intervals) {
     if (intervals.size() <= 1) {return intervals;}
     
     Collections.sort(intervals, new Comparator<Interval>(){
       @Override
       public int compare(Interval i1, Interval i2) {
         return Integer.compare(i1.start, i2.start);
       } 
     });
     
     List<Interval> list = new ArrayList<Interval>();
     int start = intervals.get(0).start;
     int end = intervals.get(0).end;     
     
     for (Interval interval: intervals) {
       if (interval.start <= end) {
         end = Math.max(end, interval.end);
       } else {
         list.add(new Interval(start, end));
         start = interval.start;
         end  = interval.end;
       }
     }
     list.add(new Interval(start, end));
     return list;
   }
  
	public static void main(String[] args) {
		
	}		
}



