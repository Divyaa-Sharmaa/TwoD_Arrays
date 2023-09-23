package TwoD_Arrays;

public class diagonalSum {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        diagonalSum_Array(arr);
    }

    public static int diagonalSum_Array(int[][] arr) {
        int sum = 0;

        // brute force --- O(n^2)
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length - 1; j++) {
                if (i == j)
                    sum += arr[i][j];
                else if (i + j == arr.length - 1)
                    sum += arr[i][j];
            }
        }

        // optimized code -- O(n)
        for (int i = 0; i < arr.length; i++) {
            // Primary Diagonal
            sum = sum + arr[i][i];

            // Secondary Diagonal
            if (i != arr.length - i - 1)
                sum = sum + arr[i][arr.length - i - 1];

        }
        return sum;
    }
}
