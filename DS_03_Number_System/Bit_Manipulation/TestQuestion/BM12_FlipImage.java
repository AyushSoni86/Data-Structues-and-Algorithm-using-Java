package DS_03_Number_System.Bit_Manipulation.TestQuestion;

import java.util.Arrays;

public class BM12_FlipImage {
    public static void main(String[] args) {
        int arr[][] = { { 1, 1, 0 },
                { 1, 0, 1 },
                { 0, 0, 1 } };

        int arr2[][] = { { 1, 1, 0, 0 },
                { 1, 0, 0, 1 },
                { 0, 1, 1, 1 },
                { 1, 0, 1, 0 } };

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrayReverse(arr[i]);
        }
        arr = change(arr);
        System.out.println(Arrays.deepToString(arr));

        System.out.println(Arrays.deepToString(flipAndInvertImage2(arr2)));
    }

    public static int[][] flipAndInvertImage2(int[][] image) {
        for (int[] row : image) {
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - i - 1] ^ 1;
                row[image[0].length - i - 1] = temp;
            }
        }
        return image;
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
            int temp = arr[i];
            arr[i] = arr[j];
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
