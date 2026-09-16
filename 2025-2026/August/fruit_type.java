class Solution {
    public int totalFruit(int[] fruits) {

        int basket1 = -1;
        int basket2 = -1;

        int last1 = -1;
        int last2 = -1;

        int start = 0;
        int max = 0;

        for (int i = 0; i < fruits.length; i++) {

            if (basket1 == -1) {
                basket1 = fruits[i];
                last1 = i;
            }

            else if (basket1 == fruits[i]) {
                last1 = i;
            }

            else if (basket2 == -1) {
                basket2 = fruits[i];
                last2 = i;
            }

            else if (basket2 == fruits[i]) {
                last2 = i;
            }

            else {
                if (last1 < last2) {
                    start = last1 + 1;
                    basket1 = fruits[i];
                    last1 = i;
                }
                else {
                    start = last2 + 1;
                    basket2 = fruits[i];
                    last2 = i;
                }
            }

            max = Math.max(max, i - start + 1);
        }

        return max;
    }
}