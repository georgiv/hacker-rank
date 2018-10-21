package warmupchallenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RepeatedString {
  static long repeatedString(String s, long n) {
    int aFull = 0;
    int aRem = 0;
    long full = n / s.length();
    long rem = n % s.length();

    char[] ls = s.toCharArray();
    for (int i = 0; i < ls.length; i++) {
      if (ls[i] == 'a') {
        if (i < rem) {
          aRem++;
        }
        aFull++;
      }
    }

    return full * aFull + aRem;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    long n = Long.parseLong(in.readLine());
    System.out.println(repeatedString(s, n));
  }
}
