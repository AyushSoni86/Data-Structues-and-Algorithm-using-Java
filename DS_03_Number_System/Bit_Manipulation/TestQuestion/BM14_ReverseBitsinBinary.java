package DS_03_Number_System.Bit_Manipulation.TestQuestion;

public class BM14_ReverseBitsinBinary {
    public static void main(String[] args) {
        System.out.println(reverseBits2(11));
    }

    static int reverseBits(int num) {
        int rev = 0;
        for (int i = 0; i < 32; i++) {
            rev = rev << 1;
            int mask = 1 << i;
            if ((num & mask) != 0) {
                rev = rev | 1;
            }

        }
        return rev;
    }

    static int reverseBits2(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev << 1;
            if ((num & 1) == 1) {
                rev = rev ^ 1;
            }
            num = num >> 1;
        }
        return rev;
    }
}
