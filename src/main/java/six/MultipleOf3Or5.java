package six;

import java.util.stream.IntStream;

//https://www.codewars.com/kata/514b92a657cdc65150000006/train/java
public class MultipleOf3Or5 {
    public int solution(int number) {
        return IntStream.range(3, number)
                .filter(value -> value % 3 == 0 || value % 5 == 0)
                .sum();
    }
}
