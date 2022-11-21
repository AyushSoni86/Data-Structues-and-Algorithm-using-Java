package DS_03_Number_System.Math_for_DSA.Part_1;

public class MD02_PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12332));
    }

    static boolean isPalindrome(int num) {
        int temp = num;
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            num = num / 10;
            rev = rev * 10 + digit;
        }
        return temp == rev;
    }
}
