package DS_03_Number_System.Math_for_DSA.Part_1;

public class MD03_ArmstrongNumber {
    public static void main(String[] args) {
        for (int i = 0; i < 10000000; i++) {
            System.out.print((isArmStrong(i)) ? i + " " : "");
        }
    }

    static boolean isArmStrong(int num) {
        int sum = 0;
        int temp = num;
        while (num != 0) {
            int digit = num % 10;
            num = num / 10;
            sum = sum + (int) Math.pow(digit, 3);
        }
        return sum == temp;
    }
}
