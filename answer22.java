import java.util.*;

public class The_Upper_Bound {
    static int upperBound(int[] arr, int key, int low, int high) {
        if (low > high) return low;
        int mid = (low + high) / 2;
        if (arr[mid] <= key) return upperBound(arr, key, mid + 1, high);
        return upperBound(arr, key, low, mid - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 6, 8};
        int key = 6;
        int index = upperBound(arr, key, 0, arr.length - 1);
        System.out.println(index >= arr.length ? arr.length : index);
    }
}
