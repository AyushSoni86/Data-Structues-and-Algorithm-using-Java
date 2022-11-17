package DS_03_Number_System.Bit_Manipulation.TestQuestion;

public class BM03_FindXORinRange {
    public static void main(String[] args) {
        System.out.println(xorInRange(12, 24));
        System.out.println(xorInRange2(12, 24));
    }

    static int xorInRange(int a, int b) {
        return findXOR(b) ^ findXOR(a - 1);
    }

    static int xorInRange2(int a, int b) {
        int ans = 0;
        for (int i = a; i <= b; i++) {
            ans = ans ^ i;
        }
        return ans;
    }

    static int findXOR(int a) {
        if (a % 4 == 0)
            return a;
        if (a % 4 == 1)
            return 1;
        if (a % 4 == 2)
            return a + 1;
        return 0;
    }
}
