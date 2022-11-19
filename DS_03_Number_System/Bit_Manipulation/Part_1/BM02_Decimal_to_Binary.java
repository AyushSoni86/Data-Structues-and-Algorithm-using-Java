package DS_03_Number_System.Bit_Manipulation.Part_1;

public class BM02_Decimal_to_Binary {
    public static void main(String[] args) {
        System.out.println(toBinary(5));
    }

    static int toBinary(int n) {
        int[] binary = new int[40];
        int i = 0;
        while (n != 0) {
            int rem = n & 1;
            n = n / 2;
            binary[i++] = rem;
        }
        int ans = 0;
        for (int j = i; j >= 0; j--) {
            ans = ans * 10 + binary[j];
        }

        return ans;
    }
}
