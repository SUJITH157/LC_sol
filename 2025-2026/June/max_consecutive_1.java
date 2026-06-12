import java.util.*;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        ArrayList<Integer> output = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                count++;
            } else {
                output.add(count);
                count = 0;
            }
        }

        output.add(count);

        int max = 0;

        for (int i = 0; i < output.size(); i++) {
            if (output.get(i) > max) {
                max = output.get(i);
            }
        }

        return max;
    }
}