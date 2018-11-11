package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepetition {
  public int lengthOfLongestSubstring(String s) {
    if (s == null || s.length() == 0) return 0;

    if (s.length() == 1) return 1;

    int res = 0;

    Map<Character, Integer> passed = new HashMap<>();
    int lastStart = 0;

    for (int i = 0; i < s.length(); i++) {
      char curr = s.charAt(i);
      if (passed.keySet().contains(curr)) {
        int tempRes = i - lastStart;
        res = Math.max(res, tempRes);
        lastStart = Math.max(lastStart, passed.get(curr) + 1);
      }
      passed.put(curr, i);
    }

    return Math.max(res, s.length() - lastStart);
  }
}
