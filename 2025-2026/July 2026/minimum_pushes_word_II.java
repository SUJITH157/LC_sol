class Solution {

    public int minimumPushes(String word) {

        int[] freq = new int[26];

        for (int i = 0; i < word.length(); i++) {
            freq[word.charAt(i) - 'a']++;
        }

        Arrays.sort(freq);

        int sum = 0;
        int count = 0;

        for (int i = 25; i >= 0; i--) {

            if (freq[i] == 0) {
                break;
            }

            if (count < 8) {
                sum += freq[i];
            }
            else if (count < 16) {
                sum += freq[i] * 2;
            }
            else if (count < 24) {
                sum += freq[i] * 3;
            }
            else {
                sum += freq[i] * 4;
            }

            count++;
        }

        return sum;
    }
}