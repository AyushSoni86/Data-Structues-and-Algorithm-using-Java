package DS_03_Number_System.Math_for_DSA.Part_2;

public class MD06_EuclidGCD {
    public static void main(String[] args) {
        System.out.println(gcd(24, 42));
    }

    static int gcd(int a, int b){
        while(b != 0){
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a ;
    }
}
