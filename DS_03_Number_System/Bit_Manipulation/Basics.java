package DS_03_Number_System.Bit_Manipulation;
public class Basics {
    public static void main(String[] args) {
        // isOddOrEven(3);

        System.out.println(multiplyByTwo(6));
        // swap two number using bitwise operators
        // int a = 2;
        // int b = 3;

    }

    // find wheather a number is odd or even
    static void isOddOrEven(int n) {
        if ((n & 1) == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }

    // multiply number by two using bitwise operators
    static int multiplyByTwo(int n){
        return n << 1;
    }


}
 