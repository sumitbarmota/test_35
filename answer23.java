import java.util.*;

public class The_Cell_Value {
    static int ceilValue(int[] arr, int key, int low, int high, int ans) {
        if (low > high) return ans;
        int mid = (low + high) / 2;
        if (arr[mid] >= key) return ceilValue(arr, key, low, mid - 1, arr[mid]);
        return ceilValue(arr, key, mid + 1, high, ans);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 6, 8};
        int key = 5;
        int res = ceilValue(arr, key, 0, arr.length - 1, -1);
        System.out.println(res);
    }
}
