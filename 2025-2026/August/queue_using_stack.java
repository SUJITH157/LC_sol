class MyQueue {

    Stack<Integer> ans;
    Stack<Integer> ans1;

    public MyQueue() {
        ans = new Stack<>();
        ans1 = new Stack<>();
    }

    public void push(int x) {
        ans.push(x);
    }

    public int pop() {

        if (ans1.isEmpty()) {

            while (!ans.isEmpty()) {
                ans1.push(ans.pop());
            }
        }

        return ans1.pop();
    }

    public int peek() {

        if (ans1.isEmpty()) {

            while (!ans.isEmpty()) {
                ans1.push(ans.pop());
            }
        }

        return ans1.peek();
    }

    public boolean empty() {
        return ans.isEmpty() && ans1.isEmpty();
    }
}