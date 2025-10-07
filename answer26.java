import java.util.*;

public class The_Magical_Scrolls {
    static int[] findScroll(int[][] matrix, int n, int m, int i, int j, int target) {
        if (i == n) return new int[]{-1, -1};
        if (j == m) return findScroll(matrix, n, m, i + 1, 0, target);
        if (matrix[i][j] == target) return new int[]{i, j};
        return findScroll(matrix, n, m, i, j + 1, target);
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        int n = 3, m = 3, target = 50;
        int[] res = findScroll(matrix, n, m, 0, 0, target);
        System.out.println("(" + res[0] + "," + res[1] + ")");
    }
}
