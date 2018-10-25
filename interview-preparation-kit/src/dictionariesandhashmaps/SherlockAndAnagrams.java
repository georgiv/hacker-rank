package dictionariesandhashmaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SherlockAndAnagrams {
  static int sherlockAndAnagrams(String s) {
    Map<String, Integer> sMap = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      for (int j = i; j < s.length(); j++) {
        char[] sub = s.substring(i, j + 1).toCharArray();
        Arrays.sort(sub);
        String key = new String(sub);
        if (!sMap.containsKey(key)) {
          sMap.put(key, 0);
        }
        sMap.put(key, sMap.get(key) + 1);
      }
    }

    int res = 0;
    for (int value : sMap.values()) {
      if (value > 1) {
        res += value * (value - 1) / 2;
      }
    }

    return res;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int q = Integer.parseInt(in.readLine());
    for (int i = 0; i < q; i++) {
      System.out.println(sherlockAndAnagrams(in.readLine()));
    }
  }
}
