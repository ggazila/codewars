package eight;

import java.util.stream.IntStream;

/*
How good are you really?
https://www.codewars.com/kata/5601409514fc93442500010b/train/java
 */
public class KataHowGoodAreYouReally {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        double sum = IntStream.of(classPoints).average().orElse(0);
        return sum < yourPoints;
    }
}