package DS_03_Number_System.Bit_Manipulation.TestQuestion;

public class DigitsInNumber {
    public static void main(String[] args) {
        System.out.println(no_digits(23423));
    }

    static int no_digits(int n){
        
        int digits = (int)(Math.log(n)/ Math.log(10));

        return digits + 1;
    }
}
