package DS_03_Number_System.Math_for_DSA;

public class Sieve {
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
}
