package DS_03_Number_System.Bit_Manipulation.Part_2;

public class BM03_ResetBit {
    public static void main(String[] args) {
        System.out.println(resetBit(15, 2));
    }

    static int resetBit(int n, int i) {
        int mask = 1 << i;
        return ~mask & n;
    }
}
