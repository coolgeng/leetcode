import java.util.*;
class MeetingRooms {
	
	public boolean canAttendMeetings(Interval[] intervals) {
		assert intervals != null : "null input";
		
		Arrays.sort(intervals, new Comparator<Integer>(){
			@Override
			public int compare(Interval o1, Interval o2) {
        int r = o1.start - o2.start;
        return r == 0 ? o1.end - o2.end : r;				
			}
    });

		for (int i = 1; i < intervals.length; i++) {
        Interval i1 = intervals[i - 1];
        Interval i2 = intervals[i];
        if (i1.end > i2.start) {
            return false;
        }
    }

    return true;        
	}
	
	public static void main(String[] args) {
		MeetingRooms mr = new MeetingRooms();
		Interval n1 = new Interval(0,30);
		Interval n2 = new Interval(5,10);
		Interval n3 = new Interval(15,20);
		Interval[] arr = {n1, n2, n3};				
		System.out.println(mr.canAttendMeetings(arr));
	}
}