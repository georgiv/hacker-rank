package stringmanipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlternatingCharacters {
  static int alternatingCharacters(String s) {
    if (s.length() == 1) {
      return 0;
    }

    int res = 0;

    char[] sArr = s.toCharArray();
    char current = sArr[0];

    for (int i = 1; i < s.length(); i++) {
      if (sArr[i] == current) {
        res++;
      } else {
        current = sArr[i];
      }
    }
    return res;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int q = Integer.parseInt(in.readLine());
    for (int i = 0; i < q; i++) {
      System.out.println(in.readLine());
    }
  }
}
