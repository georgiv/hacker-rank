package graphs;

import java.util.*;

public class FindTheNearestClone {
  private static class Graph {
    private int vertices;
    private List<Long> colours;
    private Map<Integer, List<Integer>> adjacent;

    Graph(int vertices, int[] from, int[] to, long[] colours) {
      this.vertices = vertices;
      adjacent = new HashMap<>();
      this.colours = new ArrayList<>();
      initialize(from, to, colours);
    }

    private void initialize(int[] from, int[] to, long[] colours) {
      for (int i = 0; i < from.length; i++) {
        connect(from[i], to[i]);
        connect(to[i], from[i]);
      }

      for (int i = 0; i < colours.length; i++) {
        this.colours.add(colours[i]);
      }
    }

    private void connect(int a, int b) {
      if (!adjacent.containsKey(a)) adjacent.put(a, new ArrayList<>());

      adjacent.get(a).add(b);
    }

    public List<Long> getColours() {
      return colours;
    }

    Map<Integer, List<Integer>> getAdjacent() {
      return adjacent;
    }
  }

  static int findShortest(int graphNodes, int[] graphFrom, int[] graphTo, long[] ids, int val) {
    Graph g = new Graph(graphNodes, graphFrom, graphTo, ids);

    int res = Integer.MAX_VALUE;

    for (int i = 1; i <= graphNodes; i++) {
      if (g.getColours().get(i - 1) != val) continue;

      Queue<Integer> path = new ArrayDeque<>();
      path.offer(i);

      boolean[] visited = new boolean[graphNodes];

      int levelCount = 0;
      int currentCount = 1;
      int nextCount = 0;

      while (!path.isEmpty()) {
        int current = path.poll();

        if (g.getColours().get(current - 1) == val && levelCount != 0) {
          res = Math.min(res, levelCount);
          break;
        }

        visited[current - 1] = true;

        currentCount--;
        if (currentCount == 0) {
          levelCount++;
        }

        List<Integer> adjacent = g.getAdjacent().get(current);

        if (adjacent == null) continue;

        for (int j = 0; j < adjacent.size(); j++) {
          if (visited[adjacent.get(j) - 1]) continue;

          path.offer(adjacent.get(j));
          nextCount++;
        }

        if (currentCount == 0) {
          currentCount = nextCount;
          nextCount = 0;
        }
      }
    }

    return res == Integer.MAX_VALUE ? -1 : res;
  }
}
