package six;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


class MessageValidatorSolutionTest {
    @Test
    void basicTests() {
        assertTrue(MessageValidator.isAValidMessage("3hey5hello2hi"), "3hey5hello2hi");
        assertTrue(MessageValidator.isAValidMessage("4code13hellocodewars"), "4code13hellocodewars");
        assertFalse(MessageValidator.isAValidMessage("3hey5hello2hi5"), "3hey5hello2hi5");
        assertFalse(MessageValidator.isAValidMessage("code4hello5"), "code4hello5");
        assertTrue(MessageValidator.isAValidMessage("1a2bb3ccc4dddd5eeeee"), "1a2bb3ccc4dddd5eeeee");
        assertTrue(MessageValidator.isAValidMessage("0"), "");
        assertTrue(MessageValidator.isAValidMessage(""), "");
    }
}
