package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

class Player {
  String name;
  int score;

  Player(String name, int score) {
    this.name = name;
    this.score = score;
  }
}

class Checker implements Comparator<Player> {
  public int compare(Player a, Player b) {
    if (a.score > b.score) {
      return -1;
    } else if (a.score < b.score) {
      return 1;
    } else {
      return a.name.compareTo(b.name);
    }
  }
}

public class SortingComparator {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(in.readLine());

    Player[] players = new Player[n];
    for (int i = 0; i < n; i++) {
      String[] currLine = in.readLine().split(" ");
      String name = currLine[0];
      int score = Integer.parseInt(currLine[1]);
      Player currPlayer = new Player(name, score);
      players[i] = currPlayer;
    }

    Arrays.sort(players, new Checker());
    for (int i = 0; i < n; i++) {
      System.out.println(players[i].name + " " + players[i].score);
    }
  }
}
