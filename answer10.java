import java.util.*;

public class The_Rainwater_Pond {
    static void dfs(int[][] arr, int i, int j, boolean[][] visited) {
        if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || arr[i][j] == 0 || visited[i][j]) return;
        visited[i][j] = true;
        dfs(arr, i + 1, j, visited);
        dfs(arr, i - 1, j, visited);
        dfs(arr, i, j + 1, visited);
        dfs(arr, i, j - 1, visited);
        dfs(arr, i + 1, j + 1, visited);
        dfs(arr, i + 1, j - 1, visited);
        dfs(arr, i - 1, j + 1, visited);
        dfs(arr, i - 1, j - 1, visited);
    }

    static int countPonds(int[][] arr) {
        boolean[][] visited = new boolean[arr.length][arr[0].length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1 && !visited[i][j]) {
                    dfs(arr, i, j, visited);
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 0, 1},
            {0, 1, 0},
            {1, 0, 1}
        };
        System.out.println(countPonds(arr));
    }
}
