package six;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SimpleCardGameTest {

  private final SimpleCardGame simpleCardGame = new SimpleCardGame();

  @Test
  public void testGame() {
    assertEquals(
      "small deck",
      "Steve wins 2 to 1",
      simpleCardGame.winner(new String[]{"A", "7", "8"}, new String[]{"K", "5", "9"})
    );
    
    assertEquals(
      "small deck",
      "Tie",
      simpleCardGame.winner(new String[]{"T"}, new String[]{"T"})
    );
  }
}