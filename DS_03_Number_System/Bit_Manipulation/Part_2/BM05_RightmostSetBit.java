package DS_03_Number_System.Bit_Manipulation.Part_2;

public class BM05_RightmostSetBit {
    public static void main(String[] args) {
        System.out.println(rightmostBit(13));
    }

    static int rightmostBit(int n) {
        return n & -n;
    }
}
