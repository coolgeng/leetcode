class SwapNodesInPairs {
	public ListNode swapPairs(ListNode head) {
		if (head == null) return head;
		
		ListNode fast = head;
		ListNode slow = head;
		
		while(fa) {
			
		}
		return head;
		
	}
	
	public static void main(String[] args) {
		SwapNodesInPairs sn = new SwapNodesInPairs();
		ListNode node0 = new ListNode(1);
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(3);
		ListNode node3 = new ListNode(4);
		ListNode node4 = new ListNode(5);
		node0.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		ListNode head = node0;
		while (head!=null) {
			System.out.println(head.val);		
			head = head.next;
		}

	}
}