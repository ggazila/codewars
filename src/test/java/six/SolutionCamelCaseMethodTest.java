package six;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionCamelCaseMethodTest {

    @Test
    public void testTwoWords() {
        assertEquals("TestCase", SolutionCamelCaseMethod.camelCase("test case"));
    }

    @Test
    public void testThreeWords() {
        assertEquals("CamelCaseMethod", SolutionCamelCaseMethod.camelCase("camel case method"));
    }

    @Test
    public void testLeadingSpace() {
        assertEquals("CamelCaseWord", SolutionCamelCaseMethod.camelCase(" camel case word"));
    }

    @Test
    public void testTrailingSpace() {
        assertEquals("SayHello", SolutionCamelCaseMethod.camelCase("say hello "));
    }

    @Test
    public void testSingleLetter() {
        assertEquals("Z", SolutionCamelCaseMethod.camelCase("z"));
    }

    @Test
    public void testTwoSpacesBetweenWords() {
        assertEquals("AbC", SolutionCamelCaseMethod.camelCase("ab  c"));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", SolutionCamelCaseMethod.camelCase(""));
    }

}