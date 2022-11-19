package DS_03_Number_System.Bit_Manipulation.TestQuestion;

public class BM15_ComplimentOfNumber {

    public static void main(String[] args) {
        System.out.println(bitwiseComplement(12));
    }

    static int bitwiseComplement(int n) {
        if (n == 0)
            return 1;
        int temp = n;
        int mask = 0;
        while (n != 0) {
            mask = (mask << 1) | 1;
            n = n >> 1;
        }
        return ~temp & mask;
    }
}
