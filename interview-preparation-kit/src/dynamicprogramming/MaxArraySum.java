package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxArraySum {
  static int maxSubsetSum(int[] arr) {
    if (arr.length == 1) return arr[0];

    if (arr.length == 2) return Math.max(arr[0], arr[1]);

    arr[1] = Math.max(arr[0], arr[1]);

    for (int i = 2; i < arr.length; i++) {
      arr[i] = Math.max(Math.max(arr[i - 1], arr[i - 2] + arr[i]), arr[i]);
    }

    return arr[arr.length - 1];
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    int[] arr = new int[n];
    String[] arrLine = in.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(arrLine[i]);
    }
    System.out.println(maxSubsetSum(arr));
  }
}
