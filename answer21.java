import java.util.*;

public class The_Mysterious_Index{
    static int lowerBound(int[] arr, int key, int low, int high) {
        if (low > high) return low;
        int mid = (low + high) / 2;
        if (arr[mid] >= key) return lowerBound(arr, key, low, mid - 1);
        return lowerBound(arr, key, mid + 1, high);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8};
        int key = 5;
        int pos = lowerBound(arr, key, 0, arr.length - 1);
        System.out.println(pos >= arr.length ? arr.length : pos);
    }
}
