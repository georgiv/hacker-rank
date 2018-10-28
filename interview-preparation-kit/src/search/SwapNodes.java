package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwapNodes {
  static int[][] swapNodes(int[][] indexes, int[] queries) {
    return null;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(in.readLine());
    int[][] indexes = new int[n][2];
    for (int i = 0; i < n; i++) {
      String[] nodes = in.readLine().split(" ");
      indexes[i][0] = Integer.parseInt(nodes[0]);
      indexes[i][1] = Integer.parseInt(nodes[1]);
    }

    int t = Integer.parseInt(in.readLine());
    int[] queries = new int[t];
    for (int i = 0; i < t; i++) {
      queries[i] = Integer.parseInt(in.readLine());
    }

    int[][] swapped = swapNodes(indexes, queries);
    for (int i = 0; i < swapped.length; i++) {
      for (int j = 0; j < swapped[i].length - 1; j++) {
        System.out.print(swapped[i][j] + " ");
      }
      System.out.println(swapped[i][swapped[i].length - 1]);
    }
  }
}
