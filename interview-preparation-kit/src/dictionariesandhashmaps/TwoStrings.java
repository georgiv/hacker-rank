package dictionariesandhashmaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class TwoStrings {
  static String twoStrings(String s1, String s2) {
    Set<Character> s1Set = new HashSet<>();
    for (char c : s1.toCharArray()) {
      s1Set.add(c);
    }
    for (char c : s2.toCharArray()) {
      if (s1Set.contains(c)) {
        return "YES";
      }
    }
    return "NO";
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(in.readLine());
    for (int i = 0; i < t; i++) {
      String s1 = in.readLine();
      String s2 = in.readLine();
      System.out.println(twoStrings(s1, s2));
    }
  }
}
