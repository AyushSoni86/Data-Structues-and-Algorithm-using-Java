package DS_03_Number_System.Math_for_DSA.Part_2;

public class MD08_SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 37;
        boolean[] isPrime = new boolean[n + 1];
        sieve(n, isPrime);
    }

    static void sieve(int n, boolean[] prime) {
        for (int i = 2; i * i <= n; i++) {
            if (!prime[i]) {
                for (int j = 2 * i; j <= n; j += i) {
                    prime[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!prime[i])
                System.out.print(i + " ");
        }
    }

    // code to submit on leetcode
    // https://leetcode.com/problems/count-primes/
    public static int countPrimes(int n) {
        if (n <= 1)
            return 0;
        int cnt = 0;
        boolean[] prime = new boolean[n + 1];
        prime[0] = prime[1] = true;

        for (int i = 2; i * i <= n; i++) {
            for (int j = 2 * i; j < n; j += i) {
                prime[j] = true;
            }

        }
        for (int i = 0; i < prime.length; i++) {
            if (!prime[i])
                cnt++;
        }
        return cnt - 1;
    }
}
