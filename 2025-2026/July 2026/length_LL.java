class Solution {
    // Function to find the length of the linked list
    public int lengthOfLinkedList(Node head) {
        // Initialize counter to 0
        int count = 0;

        // Initialize a temporary pointer to head
        Node temp = head;

        // Traverse the linked list
        while (temp != null) {
            // Increment count for each node
            count++;

            // Move to the next node
            temp = temp.next;
        }

        // Return the total count
        return count;
    }
}