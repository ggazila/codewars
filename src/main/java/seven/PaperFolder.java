package seven;

/*
Folding your way to the moon
https://www.codewars.com/kata/58f0ba42e89aa6158400000e/train/java
 */
public class PaperFolder {
    public static Long fold(Double distance) {
        if (distance == null || distance < 0) {
            return null;
        }
        double height = 0.0001;
        long count = 0;
        while (height < distance) {
            height = height + height;
            count++;
        }
        return count;
    }
}