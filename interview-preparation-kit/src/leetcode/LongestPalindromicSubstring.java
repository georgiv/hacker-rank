package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestPalindromicSubstring {
  public String longestPalindrome(String s) {
    if (s == null || s.length() == 0 || s.length() == 1) return s;

    Map<Character, List<Integer>> indices = new HashMap<>();

    String res = s.substring(0, 1);

    for (int i = 0; i < s.length(); i++) {
      char curr = s.charAt(i);

      if (!indices.keySet().contains(curr)) indices.put(curr, new ArrayList<>());

      List<Integer> currIndices = indices.get(curr);

      if (currIndices.size() != 0) {
        for (int j = 0; j < currIndices.size(); j++) {
          int left = currIndices.get(j);
          int right = i;
          boolean noPalindrome = false;
          while (left != right + 1 && left != right) {
            if (right - left + 1 <= res.length()) {
              noPalindrome = true;
              break;
            }
            if (s.charAt(left) == s.charAt(right)) {
              left++;
              right--;
            } else {
              noPalindrome = true;
              break;
            }
          }
          if (noPalindrome) continue;
          if (i - currIndices.get(j) + 1 > res.length()) res = s.substring(currIndices.get(j), i + 1);
        }
      }

      indices.get(curr).add(i);
    }

    return res;
  }
}
