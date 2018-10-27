package stringmanipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakingAnagrams {
  static int makeAnagram(String a, String b) {
    int[] differences = new int[26];
    for (char c : a.toCharArray()) {
      differences[c - 97]++;
    }
    for (char c : b.toCharArray()) {
      differences[c - 97]--;
    }
    int res = 0;
    for (int i = 0; i < differences.length; i++) {
      int value = differences[i];
      if (value < 0) {
        value *= -1;
      }
      res += value;
    }
    return res;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String a = in.readLine();
    String b = in.readLine();
    System.out.println(makeAnagram(a, b));
  }
}
