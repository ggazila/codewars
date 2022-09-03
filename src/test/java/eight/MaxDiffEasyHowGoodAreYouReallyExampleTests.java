package eight;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MaxDiffEasyHowGoodAreYouReallyExampleTests {
    @Test
    public void tests() {
        assertTrue(KataHowGoodAreYouReally.betterThanAverage(new int[]{ 2, 3 }, 5));
        assertTrue(KataHowGoodAreYouReally.betterThanAverage(new int[]{ 100, 40, 34, 57, 29, 72, 57, 88 }, 75));
        assertTrue(KataHowGoodAreYouReally.betterThanAverage(new int[]{ 12, 23, 34, 45, 56, 67, 78, 89, 90 }, 69));
        assertFalse(KataHowGoodAreYouReally.betterThanAverage(new int[]{ 100, 90 }, 11));
    }
}