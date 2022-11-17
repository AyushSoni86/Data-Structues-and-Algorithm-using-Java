package DS_03_Number_System.Bit_Manipulation.TestQuestion;

public class BM13_FindDuplicate {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 4, 5, 3 };
        System.out.println(findDuplicate(arr));
    }

    static int findDuplicate(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ i ^ arr[i];
        }

        return ans;
    }
}
