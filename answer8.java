import java.util.*;

public class The_Royal_Diagonal {
    static int primaryDiagonal(int[][] arr, int i) {
        if (i == arr.length) return 0;
        return arr[i][i] + primaryDiagonal(arr, i + 1);
    }

    static int secondaryDiagonal(int[][] arr, int i) {
        if (i == arr.length) return 0;
        return arr[i][arr.length - i - 1] + secondaryDiagonal(arr, i + 1);
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int sum1 = primaryDiagonal(arr, 0);
        int sum2 = secondaryDiagonal(arr, 0);
        System.out.println("Primary Diagonal Sum = " + sum1);
        System.out.println("Secondary Diagonal Sum = " + sum2);
    }
}
