package DS_03_Number_System.Bit_Manipulation.TestQuestion;

public class BM05_FindTwoUnique {
    public static void main(String[] args) {
        int[] arr = { 7, 12, 12, 34, 34, 56, 5, 34, 56, 7 };
        UniqueElement(arr);
    }

    static void UniqueElement(int[] arr) {
        // what is the approach ?
        // step 1 - first find the whole XOR of the elements
        int sum = 0;
        for (int j : arr) {
            sum ^= j;
        }
        // step 2 - find the rightmost set bit of the sum
        sum = sum & (-sum);
        // step 3 - maintain sum1 for elements having same rightmost bit and
        int sum1 = 0, sum2 = 0;

        for (int j : arr) {
            if ((j & sum) > 0)
                sum1 ^= j;
            else
                sum2 ^= j;
        }
        System.out.println("the non repeating elements are " + sum1 + " and " + sum2);
    }
}
