package stacksandqueues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class CastleOnTheGrid {
  private static class Point {
    private int x;
    private int y;

    Point(int x, int y) {
      this.x = x;
      this.y = y;
    }

    public int getX() {
      return x;
    }

    public int getY() {
      return y;
    }
  }

  static int minimumMoves(String[] grid, int startX, int startY, int goalX, int goalY) {
    char[][] charGrid = new char[grid.length][];
    for (int i = 0; i < grid.length; i++) {
      charGrid[i] = grid[i].toCharArray();
    }

    Point start = new Point(startX, startY);
    Point goal = new Point(goalX, goalY);

    Queue<Point> traverseQ = new ArrayDeque<>();
    traverseQ.offer(start);

    boolean[][] visited = new boolean[grid.length][grid.length];

    while(!traverseQ.isEmpty()) {
      Point current = traverseQ.poll();
      visited[current.getX()][current.getY()] = true;

      Point north = next(charGrid, current, -1, 0);
      Point east = next(charGrid, current, 0, 1);
      Point south = next(charGrid, current, 1, 0);
      Point west = next(charGrid, current, 0, -1);
    }

    return -1;
  }

  private static Point next(char[][] grid, Point pos, int dirX, int dirY) {
    int posX = pos.getX();
    int posY = pos.getY();

    while ((posX >= 0 && posX < grid.length &&
            posY >= 0 && posY < grid.length &&
            grid[posX][posY] == '.')) {
      posX += dirX;
      posY += dirY;
    }

    return new Point(posX - 1, posY - 1);
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(in.readLine());

    String[] grid = new String[n];
    for (int i = 0; i < n; i++) {
      grid[i] = in.readLine();
    }

    String[] positionsLine = in.readLine().split(" ");

    int startX = Integer.parseInt(positionsLine[0]);
    int startY = Integer.parseInt(positionsLine[1]);

    int goalX = Integer.parseInt(positionsLine[2]);
    int goalY = Integer.parseInt((positionsLine[3]));

    System.out.println(minimumMoves(grid, startX, startY, goalX, goalY));
  }
}
