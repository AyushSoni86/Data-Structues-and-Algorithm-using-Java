package DS_04_Array_and_Strings.Arrays_and_Questions;

import java.util.Arrays;

public class Max_Till_i {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 5, 4, 6, 8 };
        
        for (int i = 1; i < arr.length; i++) {
           arr[i] =  Math.max(arr[i-1], arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
