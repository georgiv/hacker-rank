package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewYearChaos {
  static void minimumBribes(int[] q) {
    
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
      minimumBribes(ns);
    }
  }
}
