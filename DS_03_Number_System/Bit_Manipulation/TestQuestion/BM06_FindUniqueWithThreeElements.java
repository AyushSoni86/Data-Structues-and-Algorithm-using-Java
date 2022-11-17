package DS_03_Number_System.Bit_Manipulation.TestQuestion;

public class BM06_FindUniqueWithThreeElements {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 2, 2, 5, 5, 8 };
        int n = arr.length;
        int k = 3;
        System.out.println(findUnique(arr, n, k));
    }

    static int findUnique(int[] arr, int n, int k) {
        byte size_of_int = 4;
        int int_size = 8 * size_of_int;
        int[] count = new int[int_size];

        for (int i = 0; i < int_size; i++) {
            int mask = 1 << i;
            for (int j = 0; j < n; j++) {
                if ((arr[j] & mask) != 0) {
                    count[i] += 1;
                }
            }
        }

        int result = 0;

        for (int i = 0; i < int_size; i++) {
            int mask1 = 1 << i;
            int remainder = count[i] % k;
            result = result + (remainder * mask1);
        }

        return result;
    }
}
