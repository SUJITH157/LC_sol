public long power(long a, long b) {

    long ans = 1;

    while (b > 0) {

        if ((b & 1) == 1) {
            ans *= a;
        }

        a *= a;
        b >>= 1;
    }

    return ans;
}