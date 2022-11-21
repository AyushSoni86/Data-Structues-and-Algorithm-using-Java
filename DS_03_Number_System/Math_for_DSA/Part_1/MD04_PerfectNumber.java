package DS_03_Number_System.Math_for_DSA.Part_1;

public class MD04_PerfectNumber {
    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {

            System.out.print(isPerfect(i) ? i + " " : "");
        }
    }

    static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}
