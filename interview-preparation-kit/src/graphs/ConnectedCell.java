package graphs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class ConnectedCell {
  static int maxRegion(int[][] grid) {
    if (grid == null || grid.length == 0) return 0;

    if (grid.length == 1 && grid[0] != null && grid[0].length == 1) return grid[0][0];

    int res = 0;

    int n = grid.length;
    int m = grid[0].length;

    boolean[][] visited = new boolean[n][m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (grid[i][j] == 0 || visited[i][j]) continue;

        int currentRes = 0;

        Deque<Integer> path = new ArrayDeque<>();
        path.push(i * m + j);

        while (!path.isEmpty()) {
          int current = path.pop();

          int row = current / m;
          int col = current % m;

          if (visited[row][col]) continue;

          visited[row][col] = true;

          if (grid[row][col] == 1) currentRes++;

          if (isEligible(row - 1, col - 1, grid, visited)) path.push(((row - 1) * m + (col - 1)));
          if (isEligible(row - 1, col, grid, visited)) path.push(((row - 1) * m + col));
          if (isEligible(row - 1, col + 1, grid, visited)) path.push(((row - 1) * m + (col + 1)));
          if (isEligible(row, col - 1, grid, visited)) path.push((row * m + (col - 1)));
          if (isEligible(row, col + 1, grid, visited)) path.push((row * m + (col + 1)));
          if (isEligible(row + 1, col - 1, grid, visited)) path.push(((row + 1) * m + (col - 1)));
          if (isEligible(row + 1, col, grid, visited)) path.push(((row + 1) * m + col));
          if (isEligible(row + 1, col + 1, grid, visited)) path.push(((row + 1) * m + (col + 1)));
        }

        res = Math.max(res, currentRes);
      }
    }

    return res;
  }

  private static boolean isEligible(int row,int col, int[][] grid, boolean[][] visited) {
    if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) return false;

    if (grid[row][col] == 0) return false;

    if (visited[row][col]) return false;

    return true;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(in.readLine());

    int m = Integer.parseInt(in.readLine());

    int[][] grid = new int[n][m];

    for (int i = 0; i < n; i++) {
      String[] line = in.readLine().split(" ");
      for (int j = 0; j < m; j++) {
        grid[i][j] = Integer.parseInt(line[j]);
      }
    }

    System.out.println(maxRegion(grid));
  }
}
