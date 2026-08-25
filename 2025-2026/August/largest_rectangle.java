import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer> st = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= heights.length; i++) {

            int curr;

            if (i == heights.length) {
                curr = 0;
            } else {
                curr = heights[i];
            }


            while (!st.isEmpty() && heights[st.peek()] > curr) {

                int height = heights[st.pop()];

                int width;

                if (st.isEmpty()) {
                    width = i;
                } else {
                    width = i - st.peek() - 1;
                }

                int area = height * width;

                if (area > maxArea) {
                    maxArea = area;
                }
            }

            if (i < heights.length) {
                st.push(i);
            }
        }

        return maxArea;
    }
}