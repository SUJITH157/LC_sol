class Solution {

    public int distinctPrimeFactors(int[] nums) {

        HashMap<Integer, Integer> ans = new HashMap<>();

        for (int n : nums) {

            while (n % 2 == 0) {

                if (ans.containsKey(2)) {
                    ans.put(2, ans.get(2) + 1);
                } else {
                    ans.put(2, 1);
                }

                n /= 2;
            }

            for (int i = 3; i * i <= n; i += 2) {

                while (n % i == 0) {

                    if (ans.containsKey(i)) {
                        ans.put(i, ans.get(i) + 1);
                    } else {
                        ans.put(i, 1);
                    }

                    n /= i;
                }
            }

            if (n > 2) {

                if (ans.containsKey(n)) {
                    ans.put(n, ans.get(n) + 1);
                } else {
                    ans.put(n, 1);
                }
            }
        }

        return ans.size();
    }
}