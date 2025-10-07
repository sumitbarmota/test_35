public class Q1_KingsFeast {
    static int findMax(int[] arr, int n) {
        if (n == 1) return arr[0];
        return Math.max(arr[n - 1], findMax(arr, n - 1));
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 1, 9, 5};
        System.out.println("Maximum: " + findMax(arr, arr.length));
    }
}
