package leetcode;

public class ZigZagConversion {
  public String convert(String s, int numRows) {
    if (s == null) return "";

    if (numRows == 1 || s.length() == 0 || s.length() == 1) return s;

    StringBuilder[] rowBuilders = new StringBuilder[Math.min(numRows, s.length())];
    int currentRow = 0;
    int addition = 1;
    for (int i = 0; i < s.length(); i++) {
      if (rowBuilders[currentRow] == null) rowBuilders[currentRow] = new StringBuilder();

      rowBuilders[currentRow].append(s.charAt(i));

      if (currentRow == 0) addition = 1;
      if (currentRow == numRows - 1) addition = -1;

      currentRow += addition;
    }

    for (int i = 1; i < rowBuilders.length; i++) {
      rowBuilders[0].append(rowBuilders[i]);
    }

    return rowBuilders[0].toString();
  }
}
