import java.util.*;

class MinStack {

    ArrayList<Integer> ans;
    ArrayList<Integer> ans1;

    public MinStack() {
        ans = new ArrayList<>();
        ans1 = new ArrayList<>();
    }

    public void push(int value) {

        ans.add(value);

        
        if (ans1.isEmpty()) {
            ans1.add(value);
        } else {
            int currentMin = ans1.get(ans1.size() - 1);
            ans1.add(Math.min(currentMin, value));
        }
    }

    public void pop() {
        if (!ans.isEmpty()) {
            ans.remove(ans.size() - 1);
            ans1.remove(ans1.size() - 1);
        }
    }

    public int top() {
        return ans.get(ans.size() - 1);
    }

    public int getMin() {
        return ans1.get(ans1.size() - 1);
    }
}