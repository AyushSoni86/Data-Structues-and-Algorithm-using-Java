package DS_02_Pattern_Questions.Merged_Patterns;

public class Pattern1 {
    public static void main(String[] args) {
        pattern5(5);
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
    static void pattern1_1(int n) {
        for (int i = 0; i < 2 * n + 1; i++) {
            int colInRow = (i > n) ? 2 * n - i : i;
            for (int j = 0; j <= colInRow; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int i = 0; i < n*2+1; i++) {
            int colInRow = (i > n) ? 2 * n - i : i;
            for (int j = colInRow; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= colInRow; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // pattern Output
    //      *
    //     **
    //    ***
    //   ****
    //  *****
    // ******
    //  *****
    //   ****
    //    ***
    //     **
    //      *
    static void pattern3(int n){
        for (int i = 0; i < n*2+1; i++) {
            int colInRow = (i > n) ? 2 * n - i : i;
            for (int j = colInRow; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= colInRow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // Pattern output
    //      * 
    //     * *
    //    * * *
    //   * * * *
    //  * * * * *
    // * * * * * *
    //  * * * * *
    //   * * * *
    //    * * *
    //     * *
    //      *

    static void pattern4(int n){
        for (int i = 0; i < n*2+1; i++) {
            int colInRow = (i > n) ? 2 * n - i : i;
            for (int j = 0; j <= colInRow; j++) {
                System.out.print('*');
            }
            for (int j = colInRow; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = colInRow; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= colInRow; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // pattern output
    // *          *
    // **        **
    // ***      ***
    // ****    ****
    // *****  *****
    // ************
    // *****  *****
    // ****    ****
    // ***      ***
    // **        **
    // *          *

    static void pattern5(int n){
        for (int i = 0; i < n*2+1; i++) {
            int colInRow = (i > n) ? 2 * n - i : i;
            for (int j = colInRow; j <= n; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < colInRow; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < colInRow; j++) {
                System.out.print(" ");
            }
            for (int j = colInRow; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
// pattern5 output
// ************
// *****  *****
// ****    ****
// ***      ***
// **        **
// *          *
// **        **
// ***      ***
// ****    ****
// *****  *****
// ************
    
}
