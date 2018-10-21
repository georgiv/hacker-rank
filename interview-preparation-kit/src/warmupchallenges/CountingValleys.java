package warmupchallenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingValleys {
  static int countingValleys(int n, String s) {
    int valleys = 0;
    int level = 0;
    boolean valley = false;

    char[] path = s.toCharArray();
    for (int i = 0; i < n; i++) {
      char step = path[i];

      if (step == 'U') {
        level++;
      } else {
        level--;
      }

      if (level == -1) {
        if (!valley) {
          valleys++;
        }
        valley = true;
      } else if (level >= 0) {
        valley = false;
      }
    }
    return valleys;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String path = in.readLine();
    System.out.println(countingValleys(n, path));
  }
}
