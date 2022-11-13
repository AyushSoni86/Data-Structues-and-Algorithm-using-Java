package Star_Patterns;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        pattern2(input.nextInt());
    }

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // pattern1 Output
    // ******
    // ******
    // ******
    // ******
    // ******
    // ******

    static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // pattern2 Output
    // *
    // **
    // ***
    // ****
    // *****

    static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // pattern3 Output
    // *****
    // ****
    // ***
    // **
    // *

  

}
