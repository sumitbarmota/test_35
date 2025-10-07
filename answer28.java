import java.util.*;

public class The_Queen_Jewel{
    static int[] findFirst(int[][] matrix, int n, int m, int target, int low, int high, int[] ans) {
        if (low > high) return ans;
        int mid = (low + high) / 2;
        int r = mid / m, c = mid % m;
        if (matrix[r][c] == target) {
            ans[0] = r;
            ans[1] = c;
            return findFirst(matrix, n, m, target, low, mid - 1, ans);
        }
        if (matrix[r][c] > target) return findFirst(matrix, n, m, target, low, mid - 1, ans);
        return findFirst(matrix, n, m, target, mid + 1, high, ans);
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 2},
            {3, 4, 4},
            {5, 6, 7}
        };
        int target = 4;
        int n = matrix.length, m = matrix[0].length;
        int[] ans = {-1, -1};
        int[] res = findFirst(matrix, n, m, target, 0, n * m - 1, ans);
        System.out.println("(" + res[0] + "," + res[1] + ")");
    }
}
