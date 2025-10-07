import java.util.*;

public class Potion_Mixing_Two_Sum {
    static int[] twoSum(int[] arr, int target, int i) {
        return helper(arr, target, i, new HashMap<>());
    }

    static int[] helper(int[] arr, int target, int i, HashMap<Integer, Integer> map) {
        if (i == arr.length) return new int[]{-1, -1};
        if (map.containsKey(target - arr[i])) return new int[]{map.get(target - arr[i]), i};
        map.put(arr[i], i);
        return helper(arr, target, i + 1, map);
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 7};
        int[] res = twoSum(arr, 6, 0);
        System.out.println("(" + res[0] + "," + res[1] + ")");
    }
}
