package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TrippleSum {
  static long triplets(int[] a, int[] b, int[] c) {
    long res = 0;

    Arrays.sort(a);
    Arrays.sort(b);
    Arrays.sort(c);

    List<Integer> uniquesA = getListOfUniques(a);
    List<Integer> uniquesB = getListOfUniques(b);
    List<Integer> uniquesC = getListOfUniques(c);

    for (int i = 0; i < uniquesB.size(); i++) {
      int q = uniquesB.get(i);

      int qInAIndex = Collections.binarySearch(uniquesA, q);
      if (qInAIndex < 0) {
        qInAIndex = (-1) * (qInAIndex + 1);
      } else {
        qInAIndex++;
      }

      int qInCIndex = Collections.binarySearch(uniquesC, q);
      if (qInCIndex < 0) {
        qInCIndex = (-1) * (qInCIndex + 1);
      } else {
        qInCIndex++;
      }

      res += (long) qInAIndex * qInCIndex;
    }

    return res;
  }

  static List<Integer> getListOfUniques(int[] arr) {
    List<Integer> res = new ArrayList<>();

    int lastElement = -1;
    for (int i = 0; i < arr.length; i++) {
      int currentElement = arr[i];
      if (currentElement != lastElement) {
        res.add(currentElement);
      }
      lastElement = currentElement;
    }

    return res;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    String[] lengthsLine = in.readLine().split(" ");
    int aLen = Integer.parseInt(lengthsLine[0]);
    int bLen = Integer.parseInt(lengthsLine[1]);
    int cLen = Integer.parseInt(lengthsLine[2]);

    int[] a = new int[aLen];
    String[] aLine = in.readLine().split(" ");
    for (int i = 0; i < aLen; i++) {
      a[i] = Integer.parseInt(aLine[i]);
    }

    int[] b = new int[bLen];
    String[] bLine = in.readLine().split(" ");
    for (int i = 0; i < bLen; i++) {
      b[i] = Integer.parseInt(bLine[i]);
    }

    int[] c = new int[cLen];
    String[] cLine = in.readLine().split(" ");
    for (int i = 0; i < cLen; i++) {
      c[i] = Integer.parseInt(cLine[i]);
    }

    System.out.println(triplets(a, b, c));
  }
}
