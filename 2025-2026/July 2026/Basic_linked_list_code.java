
class Node {
    int data;      
    Node next;     

    
    Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }

    
    Node(int data1) {
        data = data1;
        next = null;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an array
        int[] arr = {2, 5, 8, 7};

        // Create first node
        Node y = new Node(arr[0]);

        // Print memory reference of node
        System.out.println(y);

        // Print data stored in node
        System.out.println(y.data);
    }
}
