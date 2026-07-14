class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class Solution {

    public Node reverseData(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node start = head;
        Node end = head;

        // Move end to the last node
        while (end.next != null) {
            end = end.next;
        }

        // Swap data from both ends
        while (start != end && start.prev != end) {

            int temp = start.data;
            start.data = end.data;
            end.data = temp;

            start = start.next;
            end = end.prev;
        }

        return head;
    }
}