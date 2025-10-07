import java.util.*;

public class The_Hidden_Chamber {
    static int sumArray(int[] arr, int i) {
        if (i == arr.length) return 0;
        return arr[i] + sumArray(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(sumArray(arr, 0));
    }
}
