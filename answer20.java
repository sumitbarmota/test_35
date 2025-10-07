import java.util.*;

public class The_Treasure_Chest {
    static int lastOccurrence(int[] arr, int key, int low, int high) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == key) {
            int right = lastOccurrence(arr, key, mid + 1, high);
            return right == -1 ? mid : right;
        }
        if (arr[mid] > key) return lastOccurrence(arr, key, low, mid - 1);
        return lastOccurrence(arr, key, mid + 1, high);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3};
        int key = 2;
        System.out.println(lastOccurrence(arr, key, 0, arr.length - 1));
    }
}
