import java.util.*;

class InsertInterval {
  
  public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
    List<Interval> list = new ArrayList<Interval>();
    if (intervals.size() == 0) {list.add(newInterval); return list;}
    int start = intervals.get(0).start;
    int end = intervals.get(0).end;
    int newStart = newInterval.start;
    int newEnd = newInterval.end;
    
    for (Interval interval: intervals) {
      if (interval.start < newStart) {
        start = newStart;
      } else if ()
    }
    
  }
  public static void main(String[] args) {
    
  }
}