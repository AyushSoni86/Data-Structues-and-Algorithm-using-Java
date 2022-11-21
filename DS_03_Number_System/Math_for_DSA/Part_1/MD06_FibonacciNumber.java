package DS_03_Number_System.Math_for_DSA.Part_1;

public class MD06_FibonacciNumber {
    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            System.out.print(fibo(i) + " ");
        }
    }

    static int fibo(int num) {
        if (num == 1 || num == 2)
            return 1;
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 1; i < num; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }

}
