package six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultipleOf3Or5Test {
    @Test
    public void test() {
        assertEquals(23, new MultipleOf3Or5().solution(10));
    }
}