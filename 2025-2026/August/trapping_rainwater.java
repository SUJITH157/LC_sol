class Solution {
    public int trap(int[] height) {

        int left = 0;
        int right = left + 1;
        int water = 0;

        while (left < height.length - 1) {

            right = left + 1;

            int maxIndex = right;

            while (right < height.length) {

                if (height[right] >= height[left]) {
                    maxIndex = right;
                    break;
                }

                if (height[right] > height[maxIndex]) {
                    maxIndex = right;
                }

                right++;
            }

            if (maxIndex > left) {

                int minHeight = Math.min(height[left], height[maxIndex]);

                for (int i = left + 1; i < maxIndex; i++) {
                    water += minHeight - height[i];
                }

                left = maxIndex;
            } 
            else {
                left++;
            }
        }

        return water;
    }
}