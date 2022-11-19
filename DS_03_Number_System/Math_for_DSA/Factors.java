package DS_03_Number_System.Math_for_DSA;

public class Factors {
    public static void main(String[] args) {
        factors(20);
        System.out.println();
        factors2(20);
    }

    static void factors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.print(i + " ");
        }
    }

    static void factors2(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + " ");
                } else {

                    System.out.print(i + " " + n / i + " ");
                }
            }
        }
    }
}
