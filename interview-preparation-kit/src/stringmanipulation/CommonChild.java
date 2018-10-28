package stringmanipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommonChild {
  static int commonChild(String s1, String s2) {
    char[] s1Arr = s1.toCharArray();
    char[] s2Arr  = s2.toCharArray();

    int[][] counter = new int[s1Arr.length + 1][s2Arr.length + 1];

    for (int i = 0; i < s1Arr.length; i++) {
      for (int j = 0; j < s2Arr.length; j++) {
        if (s1Arr[i] == s2Arr[j]) {
          counter[i + 1][j + 1] = counter[i][j] + 1;
        } else {
          counter[i + 1][j + 1] = Math.max(counter[i][j + 1], counter[i + 1][j]);
        }
      }
    }

    return counter[s1Arr.length][s2Arr.length];
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s1 = in.readLine();
    String s2 = in.readLine();
    System.out.println(commonChild(s1, s2));
  }
}
