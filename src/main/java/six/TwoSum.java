package six;

/*
https://www.codewars.com/kata/52c31f8e6605bcc646000082/train/java
 */
public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{ i, j };
                }
            }
        }

        return new int[]{ 0, 0 };
    }
}