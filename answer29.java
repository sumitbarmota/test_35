import java.util.*;

public class The_Hidden_Scrolls {
    static boolean search(int[][] matrix, int n, int m, int i, int j, int target) {
        if (i < 0 || j < 0 || i >= n || j >= m) return false;
        if (matrix[i][j] == target) return true;
        if (matrix[i][j] > target) return search(matrix, n, m, i, j - 1, target);
        return search(matrix, n, m, i + 1, j, target);
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16},
            {10, 13, 14, 17}
        };
        int target = 9;
        int n = matrix.length, m = matrix[0].length;
        System.out.println(search(matrix, n, m, 0, m - 1, target));
    }
}
