package leetcode;

public class ReverseInteger {
  public int reverse(int x) {
    if (x >= -9 && x <= 9) return x;

    if (x == Integer.MIN_VALUE || x == Integer.MAX_VALUE) return 0;

    StringBuilder reversed = new StringBuilder();

    int sign = x > 0 ? 1 : -1;
    x = Math.abs(x);

    while (x > 0) {
      reversed.append(x % 10);
      x = x / 10;
    }

    long res = Long.parseLong(reversed.toString()) * sign;

    if (res > Integer.MIN_VALUE && res < Integer.MAX_VALUE) return (int) res;
    else return 0;
  }
}
