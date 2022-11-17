package DS_03_Number_System.Bit_Manipulation.Part_2;

public class BM04_ClearBit {
    public static void main(String[] args) {
        System.out.println(clearBit(15, 2));
    }

    static int clearBit(int n, int i) {
        int mask = 1 << i;
        return ~mask & n;
    }
}
