package seven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataGetMiddleCharacterTest {

    @Test
    public void evenTests() {
        assertEquals("es", KataGetMiddleCharacter.getMiddle("test"));
        assertEquals("dd", KataGetMiddleCharacter.getMiddle("middle"));
    }

    @Test
    public void oddTests() {
        assertEquals("t", KataGetMiddleCharacter.getMiddle("testing"));
        assertEquals("A", KataGetMiddleCharacter.getMiddle("A"));
    }
}