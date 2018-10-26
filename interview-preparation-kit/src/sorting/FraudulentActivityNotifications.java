package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FraudulentActivityNotifications {
  static int activityNotifications(int[] expenditure, int d) {
    if (expenditure.length <= d) {
      return 0;
    }

    int res = 0;

    int day1 = expenditure[0];
    int day2 = expenditure[1];
    int day3 = expenditure[2];

    for (int i = 4; i < expenditure.length; i++) {
      int newDay = expenditure[i];
      
    }

    return res;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    String[] params = in.readLine().split(" ");
    int n = Integer.parseInt(params[0]);
    int d = Integer.parseInt(params[1]);

    int[] expenditure = new int[n];
    String[] expenditureLine = in.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      expenditure[i] = Integer.parseInt(expenditureLine[i]);
    }

    System.out.println(activityNotifications(expenditure, d));
  }
}
