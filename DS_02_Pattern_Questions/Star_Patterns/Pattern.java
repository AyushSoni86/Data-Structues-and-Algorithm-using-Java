package DS_02_Pattern_Questions.Star_Patterns;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        pattern2(n);
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
