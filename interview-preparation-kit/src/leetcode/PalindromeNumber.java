package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PalindromeNumber {
  public boolean isPalindrome(int x) {
    if (x < 0) return false;

    if (x <= 9) return true;

    int orig = x;

    List<Integer> digits = new ArrayList<>();

    while (x > 0) {
      digits.add(x % 10);
      x = x / 10;
    }

    int reversed = 0;
    int factor = 1;
    for (int i = digits.size() - 1; i >= 0; i--) {
      reversed += digits.get(i) * factor;
      factor *= 10;
    }

    return orig == reversed;
  }
}
