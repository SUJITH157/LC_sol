class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int length = m + n;

        int[] result = new int[length];

        int k = 0;
        int l = 0;
        int i = 0;

        while (k < m && l < n) {

            if (nums1[k] <= nums2[l]) {
                result[i] = nums1[k];
                k++;
            } else {
                result[i] = nums2[l];
                l++;
            }

            i++;
        }

        while (k < m) {
            result[i] = nums1[k];
            k++;
            i++;
        }

        while (l < n) {
            result[i] = nums2[l];
            l++;
            i++;
        }

        for (int j = 0; j < length; j++) {
            nums1[j] = result[j];
        }
    }
}