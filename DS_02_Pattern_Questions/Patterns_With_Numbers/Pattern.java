package DS_02_Pattern_Questions.Patterns_With_Numbers;

public class Pattern {
    public static void main(String[] args) {
        pattern5(5);
    }

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }
    // pattern output
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5

    static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(i + 1 + " ");
            }
            System.out.println();
        }
    }
    // pattern output
    // 1 1 1 1 1
    // 2 2 2 2
    // 3 3 3
    // 4 4
    // 5

    static void pattern3(int n) {
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((count < 10) ? "0" + count++ + " " : count++ + " ");
            }
            System.out.println();
        }
    }
    // pattern output
    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10

    static void pattern4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(((i - j) % 2 == 1) ? "0 " : "1 ");
            }
            System.out.println();
        }
    }
    // pattern output
    // 1
    // 0 1
    // 1 0 1
    // 0 1 0 1
    // 1 0 1 0 1

    static void pattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - 1; j++) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j + 1 + " ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }
    // pattern output
    //       1
    //     2 1 2
    //   3 2 1 2 3
    //   4 3 2 1 2 3 4
    // 5 4 3 2 1 2 3 4 5
}
