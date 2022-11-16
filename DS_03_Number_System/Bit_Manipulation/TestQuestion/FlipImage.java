package DS_03_Number_System.Bit_Manipulation.TestQuestion;

import java.util.Arrays;

public class FlipImage {
    public static void main(String[] args) {
        int arr[][] = { { 1, 1, 0 },
                { 1, 0, 1 },
                { 0, 0, 0 } };

        int arr2[][] = { { 1, 1, 0, 0 },
                { 1, 0, 0, 1 },
                { 0, 1, 1, 1 },
                { 1, 0, 1, 0 } };

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrayReverse(arr[i]);
        }
        arr = change(arr);
        System.out.println(Arrays.deepToString(arr));
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            image[i] = arrayReverse(image[i]);
        }
        return image;
    }

    static int[] arrayReverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i] ^ 1;
            arr[i] = arr[j] ^ 1;
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

    static int[][] change(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1)
                    arr[i][j] = 0;
                else
                    arr[i][j] = 1;
            }
        }
        return arr;
    }
}
