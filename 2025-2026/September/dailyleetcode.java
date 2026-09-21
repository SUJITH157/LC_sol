class Solution {
    static final long MOD = 1000000007;

    public int numberOfSets(int n, int k) {
        int total = n + k - 1;
        int r = 2 * k;

        long[] fact = new long[total + 1];
        long[] invFact = new long[total + 1];

        fact[0] = 1;

        for (int i = 1; i <= total; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }

        invFact[total] = power(fact[total], MOD - 2);

        for (int i = total - 1; i >= 0; i--) {
            invFact[i] = invFact[i + 1] * (i + 1) % MOD;
        }

        long ans = fact[total];

        ans = ans * invFact[r] % MOD;
        ans = ans * invFact[total - r] % MOD;

        return (int) ans;
    }

    public long power(long a, long b) {
        long result = 1;

        while (b > 0) {
            if (b % 2 == 1) {
                result = result * a % MOD;
            }

            a = a * a % MOD;
            b = b / 2;
        }

        return result;
    }
}