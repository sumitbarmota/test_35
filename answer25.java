import java.util.*;

public class The_Treasure_Map {
    static boolean search(int[][] matrix, int n, int m, int i, int j, int target) {
        if (i == n) return false;
        if (j == m) return search(matrix, n, m, i + 1, 0, target);
        if (matrix[i][j] == target) return true;
        return search(matrix, n, m, i, j + 1, target);
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int n = 3, m = 3, target = 5;
        System.out.println(search(matrix, n, m, 0, 0, target) ? "Yes" : "No");
    }
}
