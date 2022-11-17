package DS_03_Number_System.Bit_Manipulation.TestQuestion;

public class BM01_DigitsInNumber {
    public static void main(String[] args) {
        System.out.println(no_digits(14654653, 10));
    }

    static int no_digits(int num, int base) {

        int digits = (int) (Math.log(num) / Math.log(base));

        return digits + 1;
    }
}
