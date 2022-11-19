package DS_03_Number_System.Math_for_DSA;

public class BinarySearchSqrt {
    public static void main(String[] args) {
        System.out.printf("%.3f", sqrt(37, 3));
    }

    static double sqrt(int n, int p) {
        int start = 0;
        int end = n;
        double root = 0.0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == n) {
                // root = m;
                return mid;
            }
            if (mid * mid > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        return root;
    }
}
