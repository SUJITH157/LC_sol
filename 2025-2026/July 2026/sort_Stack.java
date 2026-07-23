import java.util.Stack;

class Solution {

    public Stack<Integer> sort(Stack<Integer> s) {

        if (s.isEmpty()) {
            return s;
        }

        int temp = s.pop();

        sort(s);

        insert(s, temp);

        return s;
    }

    public void insert(Stack<Integer> s, int temp) {

        if (s.isEmpty() || s.peek() <= temp) {
            s.push(temp);
            return;
        }

        int val = s.pop();

        insert(s, temp);

        s.push(val);
    }
}