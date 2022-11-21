package DS_03_Number_System.Math_for_DSA.Part_1;

public class MD07_CatalanNumber {
    public static void main(String[] args) {
        System.out.println(catalan(4));
    }

    static int catalan(int n) {
        if (n <= 1) {
            return 1;
        }
        int res = 0;
        for (int i = 0; i <= n - 1; i++) {
            res += catalan(i) * catalan(n - i - 1);
        }
        return res;
    }
}
