import java.util.*;
class MeetingRoomsII {
	public int minMeetingRooms(Interval[] intervals) {
		if (intervals == null || intervals.length == 0)
		        return 0;

		    // Sort the intervals by start time
		    Arrays.sort(intervals, new Comparator<Interval>() {
		        public int compare(Interval a, Interval b) { return a.start - b.start; }
		    });

		    // Use a min heap to track the minimum end time of merged intervals
		    PriorityQueue<Interval> heap = new PriorityQueue<Interval>(intervals.length, new Comparator<Interval>() {
		        public int compare(Interval a, Interval b) { return a.end - b.end; }
		    });

		    // start with the first meeting, put it to a meeting room
		    heap.offer(intervals[0]);

		    for (int i = 1; i < intervals.length; i++) {
		        // get the meeting room that finishes earliest
		        Interval interval = heap.poll();

		        if (intervals[i].start >= interval.end) {
		            // if the current meeting starts right after 
		            // there's no need for a new room, merge the interval
		            interval.end = intervals[i].end;
		        } else {
		            // this meeting needs a new room
		            heap.offer(intervals[i]);
		        }

		        // don't forget to put the meeting room back
		        heap.offer(interval);
		    }

		    return heap.size();
	}
	
	public static void main(String[] args) {
		MeetingRoomsII mr = new MeetingRoomsII();
		Interval i1 = new Interval(0,10);
		Interval i2 = new Interval(5,15);
		Interval i3 = new Interval(12,25);
		Interval i4 = new Interval(20, 30);
		Interval i5 = new Interval(27,35);
		Interval[] arr = {i1,i2,i3,i4,i5};
		System.out.println(mr.minMeetingRooms(arr));
	}
}