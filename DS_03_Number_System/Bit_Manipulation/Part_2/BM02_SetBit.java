package DS_03_Number_System.Bit_Manipulation.Part_2;

public class BM02_SetBit {
    public static void main(String[] args) {
        System.out.println(setIthBit(3, 2));
    }

    static int setIthBit(int n, int i) {
        int mask = 1 << i;
        return n | mask;
    }
}
