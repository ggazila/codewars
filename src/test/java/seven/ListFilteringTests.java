package seven;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ListFilteringTests {

    @Test
    public void examples() {
        // assertEquals("expected", "actual");
        assertEquals(Arrays.asList(1, 2), ListFilteringKata.filterList(Arrays.asList(1, 2, "a", "b")));
        assertEquals(Arrays.asList(1, 0, 15), ListFilteringKata.filterList(Arrays.asList(1, "a", "b", 0, 15)));
        assertEquals(Arrays.asList(1, 2, 123), ListFilteringKata.filterList(Arrays.asList(1, 2, "aasf", "1", "123", 123)));
    }

}