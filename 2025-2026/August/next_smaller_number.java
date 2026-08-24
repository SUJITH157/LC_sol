
class Solution {
    public int[] nextSmallerElement(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        
        for (int i = n - 1; i >= 0; i--) {

            
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }

            
            if (!st.isEmpty()) {
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    }
}

