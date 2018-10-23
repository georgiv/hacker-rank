package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraysLeftRotation {
  static int[] rotLeft(int[] a, int d) {
    d = d % a.length;
    if (d == 0) {
      return a;
    }

    int[] rotated = new int[a.length];
    for (int i = 0; i < a.length; i++) {
      int j = i - d;
      if (j < 0) {
        j = a.length + j;
      }
      rotated[j] = a[i];
    }

    return rotated;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    String[] params = in.readLine().split(" ");
    int n = Integer.parseInt(params[0]);
    int d = Integer.parseInt(params[1]);

    String[] arrLine = in.readLine().split(" ");
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(arrLine[i]);
    }

    int[] res = rotLeft(arr, d);
    for (int i = 0; i < n; i++) {
      System.out.print(res[i]);
      if (i < n - 1) {
        System.out.print(" ");
      }
    }
    System.out.println();
  }
}
