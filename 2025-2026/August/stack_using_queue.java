class MyStack {

    Queue<Integer> ans;

    public MyStack() {
        ans = new LinkedList<>();
    }

    public void push(int x) {

        ans.offer(x);

        int size = ans.size();

        for (int i = 0; i < size - 1; i++) {
            ans.offer(ans.poll());
        }
    }

    public int pop() {
        return ans.poll();
    }

    public int top() {
        return ans.peek();
    }

    public boolean empty() {
        return ans.isEmpty();
    }
}