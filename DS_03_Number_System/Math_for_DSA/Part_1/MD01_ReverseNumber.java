package DS_03_Number_System.Math_for_DSA.Part_1;

public class MD01_ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(1234));
    }

    static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            num = num / 10;
            rev = rev * 10 + digit;
        }
        return rev;
    }
}
