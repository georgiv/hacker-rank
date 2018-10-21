package warmupchallenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JumpingOnTheClouds {
  static int jumpingOnClouds(int[] c) {
    int jumps = 0;
    int i = 0;

    while (i < c.length - 1) {
      if ((i + 2 <= c.length - 1) && (c[i + 2] == 0)) {
        i += 2;
      } else {
        i += 1;
      }
      System.out.println(i);
      jumps++;
    }

    return jumps;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String[] cloudsLine = in.readLine().split(" ");
    int[] clouds = new int[n];
    for (int i = 0; i < n; i++) {
      clouds[i] = Integer.parseInt(cloudsLine[i]);
    }
    System.out.println(jumpingOnClouds(clouds));
  }
}
