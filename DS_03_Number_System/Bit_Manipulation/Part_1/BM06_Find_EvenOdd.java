package DS_03_Number_System.Bit_Manipulation.Part_1;

import java.util.Scanner;

public class BM06_Find_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        if ((a & 1) == 0)
            System.out.println(a + " is Even Number");
        else
            System.out.println(a + " is Odd Number");

        sc.close();
    }

}
