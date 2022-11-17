package DS_03_Number_System.Bit_Manipulation.TestQuestion;

public class BM10_RotateBitsInBinary {
    static int INT_BITS = 32;

    static int leftRotate(int n, int d) {
        return (n << d) | (n >> (INT_BITS - d));
    }

    static int rightRotate(int n, int d) {
        return (n >> d) | (n << (INT_BITS - d));
    }

    public static void main(String[] args) {
        System.out.println(rotateBinary(10));
        System.out.println(leftRotate(11, 5));
    }

    static int rotateBinary(int num) {
        int result = 0;
        while (num > 0) {
            result = result << 1;
            result = result | (num & 1);
            num = num >> 1;
        }

        return result;
    }
}
