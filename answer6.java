import java.util.*;

public class The_Treasure_Island {
    static int rowSum(int[][] arr, int row, int col) {
        if (col == arr[0].length) return 0;
        return arr[row][col] + rowSum(arr, row, col + 1);
    }

    static int findMaxRow(int[][] arr, int row, int maxRow, int maxSum) {
        if (row == arr.length) return maxRow;
        int sum = rowSum(arr, row, 0);
        if (sum > maxSum) return findMaxRow(arr, row + 1, row, sum);
        return findMaxRow(arr, row + 1, maxRow, maxSum);
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int row = findMaxRow(arr, 0, 0, Integer.MIN_VALUE);
        System.out.println("Row " + (row + 1));
    }
}
