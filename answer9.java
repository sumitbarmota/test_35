import java.util.*;

public class The_Messengers_Path {
    static boolean canReach(int[][] arr, int i, int j, boolean[][] visited) {
        if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || arr[i][j] == 1 || visited[i][j]) return false;
        if (i == arr.length - 1 && j == arr[0].length - 1) return true;
        visited[i][j] = true;
        return canReach(arr, i + 1, j, visited) || canReach(arr, i - 1, j, visited) || canReach(arr, i, j + 1, visited) || canReach(arr, i, j - 1, visited);
    }

    public static void main(String[] args) {
        int[][] arr = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };
        boolean[][] visited = new boolean[arr.length][arr[0].length];
        System.out.println(canReach(arr, 0, 0, visited));
    }
}
