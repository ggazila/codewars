package seven;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class PaperFolderTest {
  @Test
  public void sampleTests() {
    assertEquals((Long)42L, PaperFolder.fold(384000000.0));
    assertEquals((Long)0L, PaperFolder.fold(0.00005));
  }
}