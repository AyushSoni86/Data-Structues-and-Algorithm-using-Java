package DS_04_Array_and_Strings.Arrays_and_Questions.MultiDimensionalArray;

public class SpiralPrint {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        spiralPrint(arr);
    }

    static void spiralPrint(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int total = row * col;
        int count = 0;

        int startCol = 0;
        int startRow = 0;
        int endCol = col - 1;
        int endRow = row - 1;

        while (count < total) {
            // print first row
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(arr[startRow][i] + " ");
                count++;
            }
            startRow++;

            // print last column
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
                count++;
            }
            endCol--;

            // print last row
            for (int i = endCol; i >= startCol; i--) {
                System.out.print(arr[endRow][i] + " ");
                count++;
            }
            endRow--;
            // print first column
            for (int i = endRow; i >= startRow; i--) {
                System.out.print(arr[i][startCol] + " ");
                count++;
            }
            startCol++;
        }

    }
}