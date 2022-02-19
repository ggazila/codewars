package seven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

// TODO: Replace examples and use TDD by writing your own tests

class SolutionValidSpacingTest {
    @Test
    void fixedTests() {
        assertTrue(KataValidSpacing.validSpacing("Hello world"), "'Hello world'");
        assertFalse(KataValidSpacing.validSpacing(" Hello world"), "' Hello world'");
        assertFalse(KataValidSpacing.validSpacing("Hello  world "), "'Hello  world '");
        assertTrue(KataValidSpacing.validSpacing("Hello"), "'Hello'");
        assertTrue(KataValidSpacing.validSpacingSimple("Helloworld"), "'Helloworld'");
    }
}
