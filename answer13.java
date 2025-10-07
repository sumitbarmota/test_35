import java.util.*;

public class The_Sorcerers_Spell {
    static String reverse(String s) {
        if (s.isEmpty()) return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(reverse(s));
    }
}
