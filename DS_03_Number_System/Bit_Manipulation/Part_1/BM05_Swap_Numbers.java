package DS_03_Number_System.Bit_Manipulation.Part_1;

public class BM05_Swap_Numbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("before swap : " + a + " " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("after swap : " + a + " " + b);
    }
}
