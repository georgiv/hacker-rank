package recursionandbacktracking;

import java.util.HashMap;
import java.util.Map;

public class DavisStaircase {
  static int stepPerms(int n) {
    Map<Integer, Integer> results = new HashMap<>();
    results.put(1, 1);
    results.put(2, 2);
    results.put(3, 4);

    return traverse(n, results);
  }

  static int traverse(int n, Map<Integer, Integer> results) {
    if (results.containsKey(n)) return results.get(n);

    int res =  traverse(n - 1, results) + traverse(n - 2, results) + traverse(n - 3, results);

    results.put(n, res);

    return res;
  }

  // Alternative solution without recursion
//  static int stepPerms(int n) {
//    if (n == 1 || n == 2) return n;
//
//    if (n == 3) return 4;
//
//    int[] result = new int[n];
//    result[0] = 1;
//    result[1] = 2;
//    result[2] = 4;
//
//    for (int i = 3; i < n; i++) {
//      result[i] = result[i - 1] + result[i - 2] + result[i - 3];
//    }
//
//    return result[n - 1];
//  }
}
