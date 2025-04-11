package sdet.algorhythms.countLetterFrequency;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class AppTest {
  @Test
  public void testCountLetterFrequency_withHello() {
    App app = new App();

    Map<Character, Integer> expected = new HashMap<>();
    expected.put('h', 1);
    expected.put('e', 1);
    expected.put('l', 2);
    expected.put('o', 1);

    Map<Character, Integer> actual = app.countLetterFrequency("Hello");
    assertEquals(
        "Letter frequency map for 'Hello' did not match the expected output.", expected, actual);
  }

  @Test
  public void testCountLetterFrequency_emptyString() {
    App app = new App();

    Map<Character, Integer> expected = new HashMap<>();
    Map<Character, Integer> actual = app.countLetterFrequency("");
    assertEquals("Letter frequency map for empty string should be empty.", expected, actual);
  }

  @Test
  public void testCountLetterFrequency_withMixedCase() {
    App app = new App();

    Map<Character, Integer> expected = new HashMap<>();
    expected.put('a', 3);
    expected.put('b', 2);
    expected.put('c', 1);

    Map<Character, Integer> actual = app.countLetterFrequency("AaBbcA");
    assertEquals("The method should treat letters in a case-insensitive manner.", expected, actual);
  }
}
