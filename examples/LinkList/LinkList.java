class LinkList {
	private Node head;
	private int listcount;
	
	public LinkList(){
		head = new Node(null);
		listcount = 0;
	}
	
	public void add(int data){
		Node temp = new Node(data);
		Node current  = head;
		
		while()
		
	}
	
	public void remove(int index){
		
	}
	
	Node public get(int index){
		
	}
	
	public static void main(String[] args) {
		LinkList ll = new LinkList();
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		ll.add(n1);
		ll.add(n2);
		ll.remove(1);
		Node n3 = new Node(3);
		ll.add(n3);
		System.out.println(ll.get(1));
		System.out.println(ll.get(2));		
		
	}
}