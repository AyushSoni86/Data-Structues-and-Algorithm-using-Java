package DS_03_Number_System.Bit_Manipulation.TestQuestion;

public class BM04_FindUniqueElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 2, 3, 4, 4, 5, 3, 5, 6 };
        System.out.println(findUnique(arr));
    }

    static int findUnique(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }
}
