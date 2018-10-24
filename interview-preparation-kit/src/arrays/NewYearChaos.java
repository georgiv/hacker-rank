package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NewYearChaos {
  static int minimumBribes(int[] q) {
    int[] sorted = new int[q.length];
    for (int i = 0; i < q.length; i++) {
      if ((q[i] - (i + 1)) > 2) {
        return -1;
      }
      sorted[i] = i + 1;
    }

    int res = 0;

    for (int i = 0; i < q.length; i++) {
      if (q[i] != sorted[i]) {
        if (q[i] == sorted[i + 1]) {
          bribe(sorted, i + 1, 1);
          res += 1;
        } else if (q[i] == sorted[i + 2]) {
          bribe(sorted, i + 2, 2);
          res += 2;
        }
      }
    }

    return res;
  }

  static void bribe(int[] q, int i, int pos) {
    int tmp = q[i - 1];
    q[i - 1] = q[i];
    q[i] = tmp;
    if (pos == 2) {
      tmp = q[i - 2];
      q[i - 2] = q[i - 1];
      q[i - 1] = tmp;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(in.readLine());

    for (int i = 0; i < t; i++) {
      int n = Integer.parseInt(in.readLine());
      int[] ns = new int[n];
      String[] nsLine = in.readLine().split(" ");
      for (int j = 0; j < n; j++) {
        ns[j] = Integer.parseInt(nsLine[j]);
      }
      System.out.println(minimumBribes(ns));
    }
  }
}
