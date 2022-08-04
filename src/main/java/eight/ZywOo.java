package eight;

import java.util.stream.IntStream;

/*
Enumerable Magic #25 - Take the First N Elements
https://www.codewars.com/kata/545afd0761aa4c3055001386/train/java
 */
public class ZywOo {
    public static int[] take(int[] arr, int n) {
        return IntStream.of(arr).limit(n).toArray();
    }
}