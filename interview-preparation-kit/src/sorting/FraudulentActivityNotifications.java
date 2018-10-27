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

    int[] counters = new int[201];
    for (int i = 0; i < d; i++) {
      counters[expenditure[i]]++;
    }

    for (int i = d; i < expenditure.length; i++) {
      double median = 0;
      if(d % 2 == 1) {
        int center = 0;
        for(int j = 0; j < counters.length; j++) {
          center = center + counters[j];

          if(center > d/2) {
            median = j;
            break;
          }
        }
      } else {
        int count = 0;
        int first = -1;
        int second = -1;
        for(int j = 0; j < counters.length; j++) {
          count = count + counters[j];

          if(count == d / 2) {
            first = j;
          } else if(count > d / 2) {
            if(first < 0 ) {
              first = j;
            }
            second = j;

            median = ((double) first + (double) second) / 2;
            break;
          }
        }
      }

      if (expenditure[i] >= median * 2) {
        res++;
      }

      counters[expenditure[i - d]]--;
      counters[expenditure[i]]++;
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
