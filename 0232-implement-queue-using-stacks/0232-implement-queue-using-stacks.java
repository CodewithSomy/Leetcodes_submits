class MyQueue {
    Stack<Integer> Q1= new Stack<>();
    Stack<Integer> Q2 = new Stack<>();

    public MyQueue() {
        
    }

    public void push(int x) {
        while (!Q1.isEmpty()) Q2.push(Q1.pop());
        Q1.push(x);
        while (!Q2.isEmpty()) Q1.push(Q2.pop());
    }

    public int pop() {
        return Q1.pop();
    }

    public int peek() {
        return Q1.peek();
    }

    public boolean empty() {
        return Q1.isEmpty();
    }
}
