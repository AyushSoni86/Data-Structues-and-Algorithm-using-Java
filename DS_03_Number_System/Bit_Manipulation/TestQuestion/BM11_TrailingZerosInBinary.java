package DS_03_Number_System.Bit_Manipulation.TestQuestion;

public class BM11_TrailingZerosInBinary {
    public static void main(String[] args) {
        System.out.println(trailingZeros(17));
        System.out.println(countTrailingZeroes(17));
    }

    // method 1
    static int trailingZeros(int num) {
        int ans = 0;
        while (num != 0) {
            if ((num & 1) == 0)
                ans++;
            else
                break;
            num = num >> 1;
        }
        return ans;
    }

    // method 2
    public static int countTrailingZeroes(int num) {
        int res = num ^ (num - 1);
        return (int) (Math.log(res) / Math.log(2));
    }
}
