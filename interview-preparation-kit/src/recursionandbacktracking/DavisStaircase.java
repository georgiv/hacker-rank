package recursionandbacktracking;

public class DavisStaircase {
  static int stepPerms(int n) {
    if (n == 1 || n == 2) return n;

    if (n == 3) return 4;

    int[] result = new int[n];
    result[0] = 1;
    result[1] = 2;
    result[2] = 4;

    for (int i = 3; i < n; i++) {
      result[i] = result[i - 1] + result[i - 2] + result[i - 3];
    }

    return result[n - 1];
  }
}
