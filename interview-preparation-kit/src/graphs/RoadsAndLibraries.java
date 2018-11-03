package graphs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class RoadsAndLibraries {
  private static class Graph {
    private int vertices;
    private Map<Integer, List<Integer>> adjacent;

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
      if (!adjacent.containsKey(a)) adjacent.put(a, new ArrayList<>());

      adjacent.get(a).add(b);
    }

    Map<Integer, List<Integer>> getAdjacent() {
      return adjacent;
    }
  }

  static long roadsAndLibraries(int n, int c_lib, int c_road, int[][] cities) {
    Graph g = new Graph(n, cities);

    boolean[] visited = new boolean[n];

    int libraries = 0;
    int roads = 0;

    for (int i = 1; i <= n; i++) {
      if (visited[i - 1]) continue;

      Deque<Integer> path = new ArrayDeque<>();
      path.push(i);

      while (!path.isEmpty()) {
        int current = path.pop();

        if (visited[current - 1]) continue;

        roads++;

        List<Integer> adjacent = g.getAdjacent().get(current);

        if (adjacent == null) continue;

        for (int j = 0; j < adjacent.size(); j++) {
          path.push(adjacent.get(j));
        }

        visited[current - 1] = true;
      }
      roads--;
      libraries++;
    }

    return Math.min(((long) libraries) * c_lib + ((long) roads) * c_road, ((long) n) * c_lib);
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    String[] params = in.readLine().split(" ");
    int n = Integer.parseInt(params[0]);
    int m = Integer.parseInt(params[1]);
    int c_lib = Integer.parseInt(params[2]);
    int c_road = Integer.parseInt(params[3]);

    int[][] cities = new int[m][2];
    for (int i = 0; i < m; i++) {
      String[] edge = in.readLine().split(" ");
      cities[i][0] = Integer.parseInt(edge[0]);
      cities[i][1] = Integer.parseInt(edge[1]);
    }

    System.out.println(roadsAndLibraries(n, c_lib, c_road, cities));
  }
}
