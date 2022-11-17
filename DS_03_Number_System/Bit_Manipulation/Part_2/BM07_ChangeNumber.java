package DS_03_Number_System.Bit_Manipulation.Part_2;

public class BM07_ChangeNumber {
    public static void main(String[] args) {
        System.out.println(change(22, 27));
    }

    static int change(int a, int b) {
        int ans = a ^ b;
        int count = 0;
        while (ans != 0) {
            if ((ans & 1) == 1)
                count++;
            ans = ans >> 1;
        }

        return count;

    }

}
