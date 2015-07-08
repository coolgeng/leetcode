class RemoveNthNodeFromEndofList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (n == 0) {return head;}
		ListNode fast = head;
		while (n > 1) {
			fast = fast.next;
			n--;
		}
		if (fast.next == null) {
			return head.next;
		}
		
		ListNode slow = head;
		fast = fast.next;
		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.nex;
		return head;
		
	}
	public static void main(String[] args) {
		RemoveNthNodeFromEndofList rl = new RemoveNthNodeFromEndofList();
		
	}
}