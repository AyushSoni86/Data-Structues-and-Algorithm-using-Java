package DS_03_Number_System.Math_for_DSA.Part_2;

public class MD07_PrimeNumber {
    public static void main(String[] args) {
        int num = 130;

        for (int i = 0; i < num; i++) {
            System.out.print(isPrime(i)? i+" ":"");
        }
    }

    static boolean isPrime(int n) {
        if(n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

}
