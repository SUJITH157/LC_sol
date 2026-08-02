class Solution {

    public int minBitFlips(int start, int goal) {

        int count = 0;

        for (int i = 0; i < 31; i++) {

            int startBit = (start >> i) & 1;
            int goalBit = (goal >> i) & 1;

            if (startBit != goalBit) {

                start = start ^ (1 << i);
                count++;
            }
        }

        return count;
    }
}