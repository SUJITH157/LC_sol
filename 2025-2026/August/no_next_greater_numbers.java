import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            Stack<Integer> temp = new Stack<>();
            int count = 0;

            while (!st.isEmpty()) {
                if (st.peek() > nums[i]) {
                    count++;
                    temp.push(st.pop());
                } else {
                    st.pop();
                }
            }

            while (!temp.isEmpty()) {
                st.push(temp.pop());
            }

            ans[i] = count;
            st.push(nums[i]);
        }

        return ans;
    }
}