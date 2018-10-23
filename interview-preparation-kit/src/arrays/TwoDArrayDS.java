package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoDArrayDS {
  static int hourglassSum(int[][] arr) {
    int res = Integer.MIN_VALUE;
    for (int i = 1; i < arr.length - 1; i++) {
      for (int j = 1; j < arr[0].length - 1; j++) {
        int sum = arr[i][j] +
                  arr[i - 1][j] +
                  arr[i - 1][j - 1] +
                  arr[i - 1][j + 1] +
                  arr[i + 1][j] +
                  arr[i + 1][j - 1] +
                  arr[i + 1][j + 1];
        if (sum > res) {
          res = sum;
        }
      }
    }
    return res;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int [][] matrix = new int[6][6];
    for (int i = 0; i < matrix.length; i++) {
      String[] es = in.readLine().split(" ");
      for (int j = 0; j < matrix[0].length; j++) {
        matrix[i][j] = Integer.parseInt(es[j]);
      }
    }
    System.out.println(hourglassSum(matrix));
  }
}
