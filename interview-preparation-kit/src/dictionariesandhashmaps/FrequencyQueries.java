package dictionariesandhashmaps;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FrequencyQueries {
  static List<Integer> freqQuery(List<int[]> queries) {
    Map<Integer, Integer> data = new HashMap<>();
    Map<Integer, Integer> frequencies = new HashMap<>();
    List<Integer> res = new ArrayList<>();

    for (int i = 0; i < queries.size(); i++) {
      int type = queries.get(i)[0];
      int element = queries.get(i)[1];
      if (type == 3) {
        Integer freq = frequencies.get(element);
        freq = freq == null ? 0 : 1;
        res.add(freq);
      } else {
        Integer oldData = data.get(element);
        oldData = oldData == null ? 0 : oldData;
        Integer oldFreq = frequencies.get(oldData);
        oldFreq = oldFreq == null ? 0 : oldFreq;

        Integer newData = null;
        if (type == 1) {
          newData = oldData + 1;
        } else {
          newData = oldData - 1;
        }

        Integer newFreq = frequencies.get(newData);
        newFreq = newFreq == null ? 0 : newFreq;

        if (newData < 1) {
          data.remove(element);
        } else {
          data.put(element, newData);
        }

        if (oldFreq == 1) {
          frequencies.remove(oldData);
        } else {
          frequencies.put(oldData, oldFreq - 1);
        }
        frequencies.put(newData, newFreq + 1);
      }
    }

    return res;
  }

  public static void main(String[] args) throws IOException {
    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
      int q = Integer.parseInt(bufferedReader.readLine().trim());
      List<int[]> queries = new ArrayList<>(q);
      Pattern p  = Pattern.compile("^(\\d+)\\s+(\\d+)\\s*$");
      for (int i = 0; i < q; i++) {
        int[] query = new int[2];
        Matcher m = p.matcher(bufferedReader.readLine());
        if (m.matches()) {
          query[0] = Integer.parseInt(m.group(1));
          query[1] = Integer.parseInt(m.group(2));
          queries.add(query);
        }
      }
      List<Integer> ans = freqQuery(queries);

      System.out.println(
            ans.stream()
                .map(Object::toString)
                .collect(Collectors.joining("\n"))
                + "\n");
    }
  }
}
