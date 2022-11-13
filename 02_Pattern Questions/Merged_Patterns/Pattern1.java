package Merged_Patterns;

public class Pattern1 {
    public static void main(String[] args) {
        pattern2(5);
    }

    // pattern Output
    // *
    // **
    // ***
    // ****
    // *****
    // ******
    // *****
    // ****
    // ***
    // **
    // *

    // method 1
    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // method 2
    static void pattern2(int n) {
        for (int i = 0; i < 2 * n + 1; i++) {
            int colInRow = (i > n) ? 2 * n - i : i;
            for (int j = 0; j <= colInRow; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
