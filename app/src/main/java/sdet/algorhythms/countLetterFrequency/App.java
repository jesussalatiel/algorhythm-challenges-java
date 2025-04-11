package sdet.algorhythms.countLetterFrequency;

import java.util.HashMap;
import java.util.Map;

public class App {
  public Map<Character, Integer> countLetterFrequency(String word) {
    Map<Character, Integer> letterFrequencyMap = new HashMap<>();

    // Convert the input string to lower case and iterate over each character.
    for (char c : word.toLowerCase().toCharArray()) {
      letterFrequencyMap.put(c, letterFrequencyMap.getOrDefault(c, 0) + 1);
    }

    return letterFrequencyMap;
  }
}
