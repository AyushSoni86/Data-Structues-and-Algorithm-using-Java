package DS_03_Number_System.Bit_Manipulation.Part_1;

public class BM01_Binary_to_Decimal {
    public static void main(String[] args) {
        System.out.println(toDecimal(1101011001));
    }

    static int toDecimal(int num) {
        int ans = 0;
        int i = 0;
        while (num != 0) {
            int digit = num % 10;
            num = num / 10;
            ans = ans + digit * (int) Math.pow(2, i++);
        }
        return ans;
    }
}
