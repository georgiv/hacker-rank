package dictionariesandhashmaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SherlockAndAnagrams {
  static int sherlockAndAnagrams(String s) {
    Map<Character, Integer> sMap = new HashMap<>();
    for (char c : s.toCharArray()) {
      if (sMap.get(c) == null) {
        sMap.put(c, 1);
      } else {
        sMap.put(c, sMap.get(c) + 1);
      }
    }

    List<Character> repeats = new ArrayList<>();
    for (char c : sMap.keySet()) {
      if (sMap.get(c) > 1) {
        repeats.add(c);
      }
    }

    if (repeats.isEmpty()) {
      return 0;
    }

    // TODO: under construnction

    return -1;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int q = Integer.parseInt(in.readLine());
    for (int i = 0; i < q; i++) {
      System.out.println(sherlockAndAnagrams(in.readLine()));
    }
  }
}
