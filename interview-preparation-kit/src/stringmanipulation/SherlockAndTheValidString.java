package stringmanipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SherlockAndTheValidString {
  static String isValid(String s) {
    Map<Character, Integer> counter = new HashMap<>();
    for (char c : s.toCharArray()) {
      counter.put(c, counter.getOrDefault(c, 0) + 1);
    }

    Map<Integer, Integer> occurrences = new HashMap<>();
    for (int v : counter.values()) {
      occurrences.put(v, occurrences.getOrDefault(v, 0) + 1);
    }

    Set<Integer> occurrencesKeys = occurrences.keySet();

    if (occurrencesKeys.size() == 1) {
      return "YES";
    }

    if (occurrencesKeys.size() > 2) {
      return "NO";
    }

    if (occurrencesKeys.size() == 2) {
      if (occurrencesKeys.contains(1) && occurrences.get(1) == 1) {
        return "YES";
      }

      Integer[] keysList = occurrencesKeys.toArray(new Integer[2]);
      int lower = keysList[0];
      int higher = keysList[1];

      if (lower > higher) {
        int tmp = lower;
        lower = higher;
        higher = tmp;
      }

      if ((higher - lower) > 1) {
        return "NO";
      }

      if (occurrences.get(higher) > 1) {
        return "NO";
      }
    }

    return "YES";
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.println(isValid(in.readLine()));
  }
}
