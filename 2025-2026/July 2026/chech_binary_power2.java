class Solution {

    public boolean isPowerOfTwo(int n) {

        if (n <= 0) {
            return false;
        }

        String binary = Integer.toBinaryString(n);

        int count = 0;

        for (int i = 0; i < binary.length(); i++) {

            if (binary.charAt(i) == '1') {
                count++;
            }
        }

        return count == 1;
    }
}