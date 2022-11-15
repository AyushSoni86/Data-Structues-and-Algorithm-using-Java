package DS_02_Pattern_Questions.Pattern_with_Alphabets;

public class Pattern {
    public static void main(String[] args) {
        // System.out.println();
        pattern2(5);
    }

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + n - i + j - 1) + " ");
            }
            System.out.println();
        }
    }
    // pattern1 output
    // E
    // D E
    // C D E
    // B C D E
    // A B C D E

    static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print((char) ('A' + n - j - 1) + " ");
            }
            System.out.println();
        }
    }
    // pattern output
    // E D C B A
    // D C B A
    // C B A
    // B A
    // A
}
