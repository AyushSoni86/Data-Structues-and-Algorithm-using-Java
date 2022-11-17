package DS_03_Number_System.Bit_Manipulation.Part_2;

public class BM06_Number_of_SetBit {
    public static void main(String[] args) {
        System.out.println(no_of_setBits(16));
        System.out.println(no_of_SetBits(16));
    }

    // method 1
    static int no_of_setBits(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1)
                count++;
            n = n >> 1;
        }
        return count;
    }

    // method 2
    static int no_of_SetBits(int n){
        int count = 0;
        while(n != 0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
}
