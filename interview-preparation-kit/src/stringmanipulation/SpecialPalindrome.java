package stringmanipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpecialPalindrome {
  static long substrCount(int n, String s) {
    int res = n;

    char[] sArr = s.toCharArray();
    for (int i = 0; i < n - 1; i++) {
      int current = sArr[i];
      for (int j = i + 1; j < n; j++) {
        if (sArr[j] == current) {
          res++;
        } else {
          if (n >= (j + 1 + j - i) && (s.substring(i, j).equals(s.substring(j + 1, j + 1 + j - i)))) {
            res++;
          }
          break;
        }
      }
    }

    return res;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String s = in.readLine();
    System.out.println(substrCount(n, s));
  }
}
