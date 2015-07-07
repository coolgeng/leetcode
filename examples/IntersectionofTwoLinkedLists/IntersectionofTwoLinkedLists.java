class IntersectionofTwoLinkedLists{
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null) {
			return null;
		}
		ListNode current ;
		int lenA = getLen(headA);
		int lenB = getLen(headB);
		
		int cut = Math.abs(lenA - lenB);
		
		if (lenA > lenB) {
			while(cut > 0) {
				headA = headA.next;
				cut --;
			}
		} else if (lenA < lenB) {
			while(cut > 0) {
				headB = headB.next;
				cut --;
			}			
		}
		
		while(headA !=null) {
			if (headA == headB) {
				return headA;
			}
			headA = headA.next;
			headB = headB.next;			
		}
		return null;
	}
	
	private int getLen(ListNode head) {
		int cut = 0;
		while(head != null) {
			head = head.next;
			cut ++;
		}
		return cut;
	}
	
	// public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	// 	if (headA == null) {
	// 		return null;
	// 	}
	// 	ListNode tailA = headA ;
	// 	while (tailA.next != null) {
	// 		tailA = tailA.next;
	// 	}
	// 	tailA.next = headB;
	// 	ListNode fast = headA;
	// 	ListNode slow = headA;
	// 	do {
	// 		if (fast == null || fast.next == null) {
	// 			tailA.next = null;
	// 			return null;
	// 		}
	// 		fast = fast.next.next;
	// 		slow = slow.next;
	// 		if(slow == fast) {
	// 			fast = headA;
	// 			while (fast!=slow) {
	// 				fast = fast.next;
	// 				slow = slow.next;
	// 			}
	// 			tailA.next = null;
	// 			return fast;
	// 		}
	// 	} while (true);
	// }
			
	public static void main(String[] args) {
		System.out.println();
	}
}