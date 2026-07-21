import java.util.*;

class Solution {

    Node flatten(Node root) {

        if (root == null)
            return null;

        ArrayList<Integer> list = new ArrayList<>();

        Node temp = root;

        while (temp != null) {

            Node down = temp;

            while (down != null) {
                list.add(down.data);
                down = down.bottom;
            }

            temp = temp.next;
        }

        Collections.sort(list);

        Node dummy = new Node(0);
        Node curr = dummy;

        for (int i = 0; i < list.size(); i++) {

            int val = list.get(i);

            curr.bottom = new Node(val);
            curr = curr.bottom;
        }

        return dummy.bottom;
    }
}