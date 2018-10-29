package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Pairs {
  static int pairs(int k, int[] arr) {
    int res = 0;

    Arrays.sort(arr);

    for (int i = 0; i < arr.length; i++) {
      int x = arr[i];
      arr[i] = Integer.MIN_VALUE;
      int yIndex = Arrays.binarySearch(arr, x + k);
      if (yIndex > 0) {
        res++;
      }
    }

    return res;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    String[] params = in.readLine().split(" ");
    int n = Integer.parseInt(params[0]);
    int k = Integer.parseInt(params[1]);

    int[] arr = new int[k];
    String[] arrLine = in.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(arrLine[i]);
    }

    System.out.println(pairs(k, arr));
  }
}
