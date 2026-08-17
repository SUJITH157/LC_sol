class Solution {
    public int sumSubarrayMins(int[] arr) {

        int n = arr.length;
        long sum = 0;

        Stack<Integer> st = new Stack<>();

        int[] left = new int[n];
        int[] right = new int[n];

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                left[i] = i + 1;
            } else {
                left[i] = i - st.peek();
            }

            st.push(i);
        }

        st.clear();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                right[i] = n - i;
            } else {
                right[i] = st.peek() - i;
            }

            st.push(i);
        }

        for (int i = 0; i < n; i++) {
            sum += (long) arr[i] * left[i] * right[i];
        }

        return (int)(sum % 1000000007);
    }
}