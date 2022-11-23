package DS_03_Number_System.Math_for_DSA.Part_2;

public class MD01_Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }

    static int factorial(int n){
        int ans = 1;
        for (int i = 1; i <= n ; i++) {
            ans = ans* i;
        }
        return ans;
    }
}
