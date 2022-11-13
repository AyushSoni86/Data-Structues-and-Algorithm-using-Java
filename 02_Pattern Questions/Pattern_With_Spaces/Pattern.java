package Pattern_With_Spaces;

public class Pattern {
    public static void main(String[] args) {
        pattern5(5);
    }  

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // pattern1 output
    //     *
    //    **
    //   ***
    //  ****
    // *****
    
    static void pattern2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // pattern2 output
    // *****
    //  ****
    //   ***
    //    **
    //     *

    static void pattern4(int n){
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2*i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //  pattern output
    //      *
    //     ***
    //    *****
    //   *******
    //  *********
    
    static void pattern5(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i*2+1; j <= n*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //  pattern output
    //  *********
    //   *******
    //    *****
    //     ***
    //      *
    
    static void pattern6(int n){
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // pattern output
    //     *
    //    * *
    //   * * *
    //  * * * *
    // * * * * *
    
    static void pattern7(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // pattern output
    // * * * * *
    //  * * * *
    //   * * *
    //    * *
    //     *
}
