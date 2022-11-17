package DS_03_Number_System.Bit_Manipulation.TestQuestion;

public class BM02_FindXOR {
    public static void main(String[] args) {
        System.out.println(findXOR(34));
        System.out.println(findXOR2(34));
    }

    static int findXOR(int num) {
        if (num % 4 == 0)
            return num;
        if (num % 4 == 1)
            return 1;
        if (num % 4 == 2)
            return num + 1;
        return 0;
    }

    static int findXOR2(int num){
        int ans = 0;
        for (int i = 0; i <= num; i++) {
            ans = ans ^ i;
        }
        return ans;
    }
}
