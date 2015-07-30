import java.util.List;
import java.util.ArrayList;

class ImplementStackusingQueues {
	
	List<Integer> queue = new ArrayList<Integer>();
    
    
	    // Push element x onto stack.
	    public void push(int x) {
	        queue.add(x);
	    }

	    // Removes the element on top of the stack.
	    public void pop() {
	        queue.remove(getSize() - 1);
	    }

	    // Get the top element.
	    public int top() {
	        return queue.get(getSize() - 1);
	    }

	    // Return whether the stack is empty.
	    public boolean empty() {
	        return queue.size() == 0;
	    }
    
	    private int getSize() {
	        return queue.size();
	    }
	
	public static void main(String[] args) {
		ImplementStackusingQueues list = new ImplementStackusingQueues();
		list.push(1);
		list.push(2);
		list.pop();
		System.out.println(list.empty());
		System.out.println(list.top());
	}
}