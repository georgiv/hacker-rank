package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IceCreamParlor {
  static String whatFlavors(int[] cost, int money) {
    Map<Integer, List<Integer>> indices = new HashMap<>();
    for (int i = 0; i < cost.length; i++) {
      int currentCost = cost[i];
      if (!indices.containsKey(currentCost)) {
        indices.put(currentCost, new ArrayList<>());
      }
      indices.get(currentCost).add(i + 1);
    }

    int ice1ID = -1;
    int ice2ID = -1;

    for (int i = 0; i < cost.length; i++) {
      ice1ID = i + 1;
      if (indices.containsKey(money - cost[i])) {
        List<Integer> indicesList = indices.get(money - cost[i]);
        ice2ID = -1;
        if ((money - cost[i]) != cost[i]) {
          ice2ID = indicesList.get(0);
        } else {
          ice2ID = indicesList.get(1);
        }
        break;
      }
    }
    if (ice1ID < ice2ID) {
      return ice1ID + " " + ice2ID;
    } else {
      return ice2ID + " " + ice1ID;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int t  = Integer.parseInt(in.readLine());
    for (int i = 0; i < t; i++) {
      int money = Integer.parseInt(in.readLine());
      int n = Integer.parseInt(in.readLine());
      int[] cost = new int[n];
      String[] costLine = in.readLine().split(" ");
      for (int j = 0; j < n; j++) {
        cost[j] = Integer.parseInt(costLine[j]);
      }
      System.out.println(whatFlavors(cost, money));
    }
  }
}
