package dictionariesandhashmaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HashTablesRansomNote {
  static String checkMagazine(String[] magazine, String[] note) {
    if (magazine.length < note.length) {
      return "No";
    }

    Map<String, Integer> magazineMap = new HashMap<>();
    for (int i = 0; i < magazine.length; i++) {
      String word = magazine[i];
      if (magazineMap.get(word) == null) {
        magazineMap.put(word, 1);
      } else {
        magazineMap.put(word, magazineMap.get(word) + 1);
      }
    }

    for (int i = 0; i < note.length; i++) {
      String word = note[i];
      if (magazineMap.get(word) == null || magazineMap.get(word) == 0) {
        return "No";
      } else {
        magazineMap.put(word, magazineMap.get(word) - 1);
      }
    }

    return "Yes";
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    String[] line = in.readLine().split("" );
    int m = Integer.parseInt(line[0]);
    int n = Integer.parseInt(line[1]);

    String[] magazine = in.readLine().split(" ");
    String[] note = in.readLine().split(" ");

    System.out.println(checkMagazine(magazine, note));
  }
}
