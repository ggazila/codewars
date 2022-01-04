package seven;

/*
Get the Middle Character
https://www.codewars.com/kata/56747fd5cb988479af000028/train/java
 */
public class KataGetMiddleCharacter {
    public static String getMiddle(String word) {
        int length = word.length();
        if (length % 2 == 0) {
            return word.substring(length / 2 - 1, length / 2 + 1);
        }

        return word.substring(length / 2, length / 2 + 1);
    }
}
