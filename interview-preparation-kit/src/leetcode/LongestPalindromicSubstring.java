package leetcode;

public class LongestPalindromicSubstring {
  public String longestPalindrome(String s) {
    if (s == null) return "";

    if (s.length() == 0 || s.length() == 1) return s;

    String res = s.substring(0, 1);

    for (int i = 0; i < s.length(); i++) {
      int offset = 0;
      while (i - offset >= 0 && i + offset < s.length()) {
        if (s.charAt(i - offset) != s.charAt(i + offset)) {
          break;
        }
        offset++;
      }
      offset--;
      if (offset * 2 + 1 > res.length()) res = s.substring(i - offset, i + offset + 1);

      offset = 0;
      while (i - offset >= 0 && i + offset + 1 < s.length()) {
        if (s.charAt(i - offset) != s.charAt(i + offset + 1)) {
          break;
        }
        offset++;
      }
      offset--;
      if (offset * 2 + 2 > res.length()) res = s.substring(i - offset, i + offset + 2);
    }

    return res;
  }
}
