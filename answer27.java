import java.util.*;

public class The_Battle_Formation {
    static boolean searchMatrix(int[][] matrix, int target, int low, int high, int m) {
        if (low > high) return false;
        int mid = (low + high) / 2;
        int r = mid / m, c = mid % m;
        if (matrix[r][c] == target) return true;
        if (matrix[r][c] > target) return searchMatrix(matrix, target, low, mid - 1, m);
        return searchMatrix(matrix, target, mid + 1, high, m);
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5},
            {7, 10, 11},
            {16, 20, 30}
        };
        int target = 10;
        int n = matrix.length, m = matrix[0].length;
        System.out.println(searchMatrix(matrix, target, 0, n * m - 1, m));
    }
}
