package seven;

/*
Valid Spacing
https://www.codewars.com/kata/5f77d62851f6bc0033616bd8/train/java
 */
public class KataValidSpacing {

    public static boolean validSpacing(String s) {
        if (s.startsWith(" ") || s.endsWith(" ")) {
            return false;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ') {
                return false;
            }
        }

        return true;
    }

    public static boolean validSpacingSimple(String s) {
        return !s.startsWith(" ") && !s.endsWith(" ") && !s.contains("  ");
    }
}