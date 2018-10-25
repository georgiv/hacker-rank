package dictionariesandhashmaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CountTriplets {
  static long countTriplets(List<Long> arr, long r) {
    Map<Long, List<Long>> indices = new HashMap<>();
    for (int i = 0; i < arr.size(); i++) {
      long n = arr.get(i);
      if (!indices.containsKey(n)) {
        indices.put(n, new ArrayList<>());
      }
      indices.get(n).add((long) i);
    }

    long res = 0;

    for (int i = 0; i < arr.size(); i++) {
      long second = arr.get(i);
      if (second % r != 0) {
        continue;
      }

      long first = second / r;
      if (!indices.containsKey(first)) {
        continue;
      }
      long third = second * r;
      if (!indices.containsKey(third)) {
        continue;
      }


      int firstCount = Collections.binarySearch(indices.get(first), (long) i);
      if (firstCount < 0) {
        firstCount = - 1 - firstCount;
      }
      int thirdCount = Collections.binarySearch(indices.get(third), (long) i);
      if (thirdCount < 0) {
        thirdCount = - 1 - thirdCount - 1;
      }
      thirdCount = indices.get(third).size() - 1 - thirdCount;

      res += (long) firstCount * (long) thirdCount;

    }

    return res;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    String[] params = in.readLine().split(" ");
    int n = Integer.parseInt(params[0]);
    long r = Long.parseLong(params[1]);

    List<Long> arr = new ArrayList<>();
    String[] arrLine = in.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr.add(Long.parseLong(arrLine[i]));
    }

    System.out.println(countTriplets(arr, r));
  }
}
