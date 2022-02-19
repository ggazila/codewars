package six;

/*
https://www.codewars.com/kata/587731fda577b3d1b0001196/train/java
CamelCase Method
 */
public class SolutionCamelCaseMethod {

    public static String camelCase(String str) {
        if (str.isEmpty()) {
            return str;
        }
        char[] chars = str.toCharArray();

        StringBuilder builder = new StringBuilder();

        builder.append(Character.toUpperCase(chars[0]));

        for (int i = 1; i < chars.length; i++) {
            char currentChar = chars[i];
            builder.append(chars[i - 1] == ' ' ? Character.toUpperCase(currentChar) : currentChar);
        }

        return builder.toString().replace(" ", "");
    }

}
