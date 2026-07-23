public void reverse(Stack<Integer> s) {

    if (s.isEmpty()) {
        return;
    }

    int temp = s.pop();

    reverse(s);

    insertAtBottom(s, temp);
}

public void insertAtBottom(Stack<Integer> s, int temp) {

    if (s.isEmpty()) {
        s.push(temp);
        return;
    }

    int val = s.pop();

    insertAtBottom(s, temp);

    s.push(val);
}