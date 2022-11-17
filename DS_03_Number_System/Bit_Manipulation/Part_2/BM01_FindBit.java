package DS_03_Number_System.Bit_Manipulation.Part_2;

public class BM01_FindBit {
    public static void main(String[] args) {
        System.out.println(findIthBit(3, 2));
        System.out.println(findBit(3, 2));
    }

    // method 1
    static int findBit(int n, int i) {
        n = n >> i;
        return (n & 1) == 1 ? 1 : 0;
    }

    // method 2
    static int findIthBit(int n, int i) {
        int mask = 1 << i;
        return ((mask & n) > 0) ? 1 : 0;
    }
}
