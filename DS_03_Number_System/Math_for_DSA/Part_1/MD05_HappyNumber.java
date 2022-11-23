package DS_03_Number_System.Math_for_DSA.Part_1;

public class MD05_HappyNumber {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            System.out.print(isHappy(i) ? i + " " : "");
        }
    }

    static int square(int num) {
        int sum = 0;
        if (num < 10)
            return num;
        while (num != 0) {
            int digit = num % 10;
            num = num / 10;
            sum += digit * digit;
        }
        return sum;
    }

    static boolean isHappy(int num) {
        int fast = num;
        int slow = num;
        do {
            slow = square(slow);
            fast = square(square(fast));
        } while (slow != fast);
        return slow == 1;
    }
}
