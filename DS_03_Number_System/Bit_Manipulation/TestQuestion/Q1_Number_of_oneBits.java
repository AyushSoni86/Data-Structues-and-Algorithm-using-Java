package DS_03_Number_System.Bit_Manipulation.TestQuestion;

import java.util.Scanner;

public class Q1_Number_of_oneBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n = sc.nextInt();
        System.out.println("The number of set bits are : ");
        System.out.println(count(n));
        sc.close();
    }

    static int count(int n) {
        int cnt = 0;
        while (n != 0) {
            if ((n & 1) == 1)
                cnt++;
            n >>= 1;
        }
        return cnt;
    }
}
