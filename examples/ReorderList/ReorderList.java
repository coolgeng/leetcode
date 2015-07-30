class ReorderList {
	public void reorderList(ListNode head) {
		
	}
			
	public static void main(String[] args) {
		ReorderList rl = new ReorderList();
		ListNode ln1 = new ListNode(1);		
		ListNode ln2 = new ListNode(2);
		ListNode ln3 = new ListNode(3);		
		ListNode ln4 = new ListNode(4);
		ln1.next = ln2;
		ln2.next = ln3;
		ln3.next = ln4;

		ListNode head = ln1;
				
		rl.reorderList(head);		

		while(head!=null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
	
}