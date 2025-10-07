import java.util.*;

public class The_Archers_Range {
    static int firstOccurrence(int[] arr, int key, int low, int high) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == key) {
            int left = firstOccurrence(arr, key, low, mid - 1);
            return left == -1 ? mid : left;
        }
        if (arr[mid] > key) return firstOccurrence(arr, key, low, mid - 1);
        return firstOccurrence(arr, key, mid + 1, high);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3};
        int key = 2;
        System.out.println(firstOccurrence(arr, key, 0, arr.length - 1));
    }
}
