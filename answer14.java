import java.util.*;

public class The_Dragon_Roar {
    static void printNumbers(int n, int i) {
        if (i > n) return;
        System.out.print(i + " ");
        printNumbers(n, i + 1);
    }

    public static void main(String[] args) {
        int n = 5;
        printNumbers(n, 1);
    }
}
