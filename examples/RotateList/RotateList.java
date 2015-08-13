class RotateList {
	public ListNode rotateRight(ListNode head, int n) {
	        if(head==null||head.next==null||n==0)
	            return head;
	        ListNode fast = head, slow = head,countlen = head;
	        ListNode newhead = new ListNode(-1);
	        int len = 0;
        
	        while(countlen!=null){
	            len++;
	            countlen = countlen.next;
	        }
        
	        n = n%len;
	        if(n==0)
	            return head;
        
	        for(int i = 0; i < n; i++)
	            fast = fast.next;
        
	        while(fast.next!=null){
	            slow = slow.next;
	            fast = fast.next;
	        }
        
	        newhead = slow.next;
	        fast.next = head;
	        slow.next = null;
        
	        return newhead;
	    }
			
	public static void main(String[] args) {
		RotateList rl = new RotateList();
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		ListNode head = rl.rotateRight(node1, 2);		
		while(head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
}