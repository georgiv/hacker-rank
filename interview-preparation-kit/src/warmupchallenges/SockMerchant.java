package warmupchallenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class SockMerchant {
  static int sockMerchant(int n, int[] ar) {
    int pairs = 0;
    HashMap<Integer, Integer> m = new HashMap<>();

    for (int i = 0; i < n; i++) {
      int item = ar[i];
      if (m.get(item) == null || m.get(item) == 0) {
        m.put(item, 1);
      } else {
        pairs++;
        m.put(item, 0);
      }
    }

    return pairs;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String[] socksLine = in.readLine().split(" ");
    int[] socks = new int[n];
    for (int i = 0; i < n; i++) {
      socks[i] = Integer.parseInt(socksLine[i]);
    }
    System.out.println(sockMerchant(n, socks));
  }
}
