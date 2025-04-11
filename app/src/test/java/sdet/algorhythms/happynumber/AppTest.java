package sdet.algorhythms.happyNumber;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {
  @Test
  public void testIsHappyNumber_whenHappy_returnsTrue() {
    App app = new App();
    // For input 19:
    // The getNextNumber(19) method prints 81 then 1.
    // Since the returned value is 1, isHappyNumber should return true.
    boolean result = app.isHappyNumber(19);
    assertTrue("19 should be considered a happy number.", result);
  }

  @Test
  public void testIsHappyNumber_whenNotHappy_returnsFalse() {
    App app = new App();
    // For input 2:
    // The getNextNumber(2) method prints 4 and returns 4,
    // so isHappyNumber should return false.
    boolean result = app.isHappyNumber(2);
    assertFalse("2 should not be considered a happy number.", result);
  }
}
