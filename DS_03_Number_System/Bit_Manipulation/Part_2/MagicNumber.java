package DS_03_Number_System.Bit_Manipulation.Part_2;



public class MagicNumber {
    public static void main(String[] args) {
        int n = 5;
        int ans = 0;
        int cnt = 1;
        while (n != 0) {
            if ((n & 1) == 1) {
                ans = ans + (int)Math.pow(5, cnt);
            }
            n = n >> 1;
            cnt++;
        }
        System.out.println(ans);
    }
}
