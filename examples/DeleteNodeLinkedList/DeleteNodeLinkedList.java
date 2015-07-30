class DeleteNodeLinkedList {
	
	public void deleteNode(ListNode node) {
    if(node == null) return;
    node.val = node.next.val;
    node.next = node.next.next;
	}
	
	public static void main(String[] args) {
		DeleteNodeLinkedList dn = new DeleteNodeLinkedList();
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);						
		a.next = b;
		b.next = c;
		c.next = d;
		dn.deleteNode(b);
		System.out.println(a.val);
		System.out.println(a.next.val);		
		System.out.println(a.next.next.val);				
	}
}