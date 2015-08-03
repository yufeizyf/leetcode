class MyQueue {
	Stack<Integer> stackIn = new Stack<Integer>();
	Stack<Integer> stackOut = new Stack<Integer>();

    // Push element x to the back of queue.
    public void push(int x) {
    	while(!stackOut.isEmpty()) {
    		stackIn.push(stackOut.pop());
    	}
    	
    	stackIn.push(x);
    	
    	while(!stackIn.isEmpty()) {
    		stackOut.push(stackIn.pop());
    	}
    }

    // Removes the element from in front of queue.
    public void pop() {
    	if(!stackOut.isEmpty()) {
    		stackOut.pop();
    	}
    }

    // Get the front element.
    public int peek() {
    	if(!stackOut.isEmpty()) {
    		return stackOut.peek();
    	}
    	else {
    		return 0;
    	}
    }

    // Return whether the queue is empty.
    public boolean empty() {
    	return stackOut.isEmpty();
    }
}
