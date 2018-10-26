package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MarkAndToys {
  static int maximumToys(int[] prices, int k) {
    Arrays.sort(prices);

    int counter = -1;
    while(k > 0) {
      counter++;
      k -= prices[counter];
    }
    return counter;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    String[] params = in.readLine().split(" ");
    int n = Integer.parseInt(params[0]);
    int k = Integer.parseInt(params[1]);

    String[] pricesLine = in.readLine().split(" ");
    int[] prices = new int[n];
    for (int i = 0; i < n; i++) {
      prices[i] = Integer.parseInt(pricesLine[i]);
    }

    System.out.println(maximumToys(prices, k));
  }
}
