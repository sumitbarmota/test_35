import java.util.*;

public class Tower_Of_Temples {
    static void towerOfHanoi(int n, char from, char to, char aux) {
        if (n == 0) return;
        towerOfHanoi(n - 1, from, aux, to);
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        towerOfHanoi(n - 1, aux, to, from);
    }

    static int moves(int n) {
        if (n == 0) return 0;
        return 2 * moves(n - 1) + 1;
    }

    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, 'A', 'C', 'B');
        System.out.println("Total moves: " + moves(n));
    }
}
