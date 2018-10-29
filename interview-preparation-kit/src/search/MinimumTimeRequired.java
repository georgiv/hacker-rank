package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MinimumTimeRequired {
  static long minTime(long[] machines, long goal) {
    Arrays.sort(machines);

    long lowerBound = goal * machines[0] / machines.length;
    long upperBound = goal * machines[machines.length - 1] / machines.length;

    while (lowerBound < upperBound) {
      long average = lowerBound + (upperBound - lowerBound) / 2;

      long production = 0;
      for (int i = 0; i < machines.length; i++) {
        production += average / machines[i];
      }
      if (production < goal) {
        lowerBound = average + 1;
      } else {
        upperBound = average;
      }
    }

    return upperBound;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    String[] params = in.readLine().split(" ");
    int n = Integer.parseInt(params[0]);
    long goal = Long.parseLong(params[1]);

    long[] machines = new long[n];
    String[] machinesLine = in.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      machines[i] = Long.parseLong(machinesLine[i]);
    }

    System.out.println(minTime(machines, goal));
  }
}
