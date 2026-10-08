class Solution {

    public void buildMinHeap(int[] nums) {

        int n = nums.length;

        for (int i = n / 2 - 1; i >= 0; i--) {

            int current = i;

            while (true) {

                int left = left(current);
                int right = right(current);
                int smallest = current;

                if (left < n && nums[left] < nums[smallest]) {
                    smallest = left;
                }

                if (right < n && nums[right] < nums[smallest]) {
                    smallest = right;
                }

                if (smallest == current) {
                    break;
                }

                int temp = nums[current];
                nums[current] = nums[smallest];
                nums[smallest] = temp;

                current = smallest;
            }
        }
    }

    public int parent(int i) {
        return (i - 1) / 2;
    }

    public int left(int i) {
        return 2 * i + 1;
    }

    public int right(int i) {
        return 2 * i + 2;
    }
}