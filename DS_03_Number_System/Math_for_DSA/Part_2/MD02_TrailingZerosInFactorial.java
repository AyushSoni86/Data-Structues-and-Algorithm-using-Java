package DS_03_Number_System.Math_for_DSA.Part_2;

public class MD02_TrailingZerosInFactorial {
    public static void main(String[] args) {
        System.out.println(trailingZeros(30));
    }

    static int trailingZeros(int n) {
        int result = 0;
        for (int i = 5; i <= n; i *= 5) {
            result = result + n / i;
        }
        return result;
    }
}
