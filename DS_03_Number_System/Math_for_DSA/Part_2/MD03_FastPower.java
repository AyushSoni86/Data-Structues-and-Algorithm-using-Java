package DS_03_Number_System.Math_for_DSA.Part_2;

public class MD03_FastPower {
    public static void main(String[] args) {
        System.out.println(fastPower(3, 4));
    }

    static int fastPower(int a, int b) {
        int res = 1;
        while (b > 0) {
            if ((b & 1) != 0) {
                res = res * a;
            }
            a = a * a;
            b = b >> 1;
        }
        return res;
    }
}
