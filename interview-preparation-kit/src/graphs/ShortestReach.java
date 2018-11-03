package graphs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ShortestReach {
  private static class Graph {
    private int vertices;
    private Map<Integer, Set<Integer>> adjacent;

    Graph(int vertices, int[][] edges) {
      this.vertices = vertices;
      adjacent = new HashMap<>();
      initialize(edges);
    }

    private void initialize(int[][] edges) {
      for (int i = 0; i < edges.length; i++) {
        connect(edges[i][0], edges[i][1]);
        connect(edges[i][1], edges[i][0]);
      }
    }

    private void connect(int a, int b) {
      if (!adjacent.containsKey(a)) adjacent.put(a, new HashSet<>());

      adjacent.get(a).add(b);
    }

    Map<Integer, Set<Integer>> getAdjacent() {
      return adjacent;
    }

    int[] distances(int start) {
      int[] res = new int[vertices];

      Queue<Integer> path = new ArrayDeque<>();
      path.offer(start);

      boolean[] visited = new boolean[vertices];

      int distance = 0;
      int levelCount = 1;
      int nextCount = 0;

      while (!path.isEmpty()) {
        int current = path.poll();

        if (!visited[current - 1]) {
          visited[current - 1] = true;
          res[current - 1] = distance * 6;

          Set<Integer> adjacent = getAdjacent().get(current);

          if (adjacent == null) continue;

          for (int a : adjacent) {
            path.offer(a);
            nextCount++;
          }
        }

        levelCount--;
        if (levelCount == 0) {
          levelCount = nextCount;
          nextCount = 0;
          distance++;
        }
      }

      for (int i = 0; i < vertices; i++) {
        if (i + 1 != start && res[i] == 0) res[i] = -1;
      }

      return res;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    int q = Integer.parseInt(in.readLine());

    for (int i = 0; i < q; i++) {
      String[] params = in.readLine().split(" ");
      int n = Integer.parseInt(params[0]);
      int m = Integer.parseInt(params[1]);

      int[][] edges = new int[m][2];
      for (int j = 0; j < m; j++) {
        String[] edgeLine = in.readLine().split(" ");
        edges[j][0] = Integer.parseInt(edgeLine[0]);
        edges[j][1] = Integer.parseInt(edgeLine[1]);
      }

      int start = Integer.parseInt(in.readLine());

      Graph g = new Graph(n, edges);

      int[] distances = g.distances(start);
      for (int j = 0; j < distances.length; j++) {
        if (j + 1 == start) continue;

        System.out.print(distances[j]);

        if (j == n - 1) {
          System.out.println();
        } else {
          System.out.print(" ");
        }
      }
    }
  }
}
