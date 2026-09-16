import java.util.HashMap;

class Solution {

    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    public int atMost(int[] nums, int k) {

        if (k == 0) {
            return 0;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {

            int value = nums[right];

            map.put(value, map.getOrDefault(value, 0) + 1);

            while (map.size() > k) {

                int leftValue = nums[left];

                map.put(leftValue, map.get(leftValue) - 1);

                if (map.get(leftValue) == 0) {
                    map.remove(leftValue);
                }

                left++;
            }

            count += right - left + 1;
        }

        return count;
    }
}