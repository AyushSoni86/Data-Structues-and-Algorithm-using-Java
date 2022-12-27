package DS_04_Array_and_Strings.Arrays_and_Questions;

public class SumOfAllSubArrays {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 7, 2 };
        sum(arr);
    }

    static void sum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int ans = 0;
            for (int j = i; j < arr.length; j++) {
                ans = ans + arr[j];
                System.out.println(ans); 
            }
        }
    }
}
