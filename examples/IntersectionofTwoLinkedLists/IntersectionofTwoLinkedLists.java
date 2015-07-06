class IntersectionofTwoLinkedLists{
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null) {
			return null;
		}
		ListNode tailA = headA ; 
		while (tailA.next != null) {
			tailA = tailA.next;
		}
		tailA.next = headB;
		ListNode fast = headA;
		ListNode slow = headA;
		do {
			if (fast == null || fast.next == null) {
				tailA.next = null;
				return null;
			}
			fast = fast.next.next;
			slow = slow.next;
			if(slow == fast) {
				fast = headA;
				while (fast!=slow) {
					fast = fast.next;
					slow = slow.next;
				}
				tailA.next = null;
				return fast;
			}
		} while (true);
	}
			
	public static void main(String[] args) {
		System.out.println();
	}
}