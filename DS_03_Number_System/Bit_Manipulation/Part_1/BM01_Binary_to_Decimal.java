package DS_03_Number_System.Bit_Manipulation.Part_1;

public class BM01_Binary_to_Decimal {
    public static void main(String[] args) {
        System.out.println(toDecimal(110101));
    }

    static int toDecimal(int binary) {
        if (binary <= 1)
            return binary;
        int n = 0;
        int ans = 0;
        while (n != 0) {
            int mask = 1 << n ;
            int temp = binary%10;
            ans += temp*mask;
            binary = binary/10;
            n++;
        }
        return ans;
    }
}
