import java.util.*;
class Solution {
   
    public boolean isMinHeap(int[] nums) {
        int n = nums.length;
        for (int i = 0; i <= (n / 2) - 1; i++) {

            int left = 2 * i + 1;
            if (left < n && nums[i] > nums[left]) {
                return false;
            }
            int right = 2 * i + 2;
            if (right < n && nums[i] > nums[right]) {
                return false;
            }
        }
        return true;
    }
}