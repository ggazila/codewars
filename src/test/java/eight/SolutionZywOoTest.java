package eight;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionZywOoTest {
    @Test
    public void basicTests() {
        assertArrayEquals("should return the first 3 items", new int[]{ 0, 1, 2 }, ZywOo.take(new int[]{ 0, 1, 2, 3, 5, 8, 13 }, 3));
    }
}