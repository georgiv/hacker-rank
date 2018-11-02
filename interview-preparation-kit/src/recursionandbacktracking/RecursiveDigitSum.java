package recursionandbacktracking;

public class RecursiveDigitSum {
  static int superDigit(String n, int k) {
    return traverse(n.toCharArray(), k, 0, 0);
  }

  static int traverse(char[] n, int k, int i, int res) {
    if (i == n.length) return res;

    res += k * (n[i] - 48);

    int current = 0;
    while (res > 0) {
      current += res % 10;
      res = res / 10;

      if (current > 9) {
        res = current;
        current = 0;
      }
    }
    res = current;

    return traverse(n, k, i + 1, res);
  }

  public static void main(String[] args) {
    System.out.println('9' + 0);
  }
}
