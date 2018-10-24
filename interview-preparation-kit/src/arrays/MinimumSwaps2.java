package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinimumSwaps2 {
  static int minimumSwaps(int[] arr) {
    int res = 0;
    for (int i = 0; i < arr.length; i++) {
      while ((arr[i] - 1) != i) {
        int tmp = arr[arr[i] - 1];
        arr[arr[i] - 1] = arr[i];
        arr[i] = tmp;
        res++;
      }
    }
    return res;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(in.readLine());

    int[] ns = new int[n];
    String[] nsLine = in.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      ns[i] = Integer.parseInt(nsLine[i]);
    }

    System.out.println(minimumSwaps(ns));
  }
}
