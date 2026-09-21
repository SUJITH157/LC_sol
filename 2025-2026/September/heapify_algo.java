class Solution {

    public void heapify(int[] nums, int ind, int val) {

        nums[ind] = val;

        int i = ind;

        while (true) {

            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int smallest = i;

            if (left < nums.length && nums[left] < nums[smallest]) {
                smallest = left;
            }

            if (right < nums.length && nums[right] < nums[smallest]) {
                smallest = right;
            }

            if (smallest == i) {
                break;
            }

            int temp = nums[i];
            nums[i] = nums[smallest];
            nums[smallest] = temp;

            i = smallest;
        }
    }
}