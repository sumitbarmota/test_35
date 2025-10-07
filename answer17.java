import java.util.*;

public class The_Farmer_Basket{
    static boolean exists(int[] arr, int key, int i) {
        if (i == arr.length) return false;
        if (arr[i] == key) return true;
        return exists(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 8};
        int key = 5;
        System.out.println(exists(arr, key, 0));
    }
}
