package stacksandqueues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBrackets {
  static String isBalanced(String s) {
    Deque<Character> openingBracketsStack = new ArrayDeque<>();
    char[] brackets = s.toCharArray();
    for (int i = 0; i < brackets.length; i++) {
      char currentBracket = brackets[i];
      if ('{' == currentBracket ||
          '[' == currentBracket ||
          '(' == currentBracket) {
        openingBracketsStack.offerFirst(currentBracket);
      } else {
        if (openingBracketsStack.isEmpty()) {
          return "NO";
        }

        char currentOpeningBracket = openingBracketsStack.pollFirst();

        if ((currentOpeningBracket == '{' && currentBracket == '}') ||
            (currentOpeningBracket == '[' && currentBracket == ']') ||
            (currentOpeningBracket == '(' && currentBracket == ')')) {
          continue;
        } else {
          return "NO";
        }
      }
    }

    if (!openingBracketsStack.isEmpty()) {
      return "NO";
    }

    return "YES";
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    for (int i = 0; i < n; i++) {
      System.out.println(isBalanced(in.readLine()));
    }
  }
}
