package uber;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class RateLimiter {
  private Map<String, Integer> counters;
  private Map<String, Queue<Long>> timestamps;
  private int requestLimit;
  private long timeLimit;

  public RateLimiter(int requestLimit, long timeLimit) {
    this.requestLimit = requestLimit;
    this.timeLimit = timeLimit;
    counters = new HashMap<>();
    timestamps = new HashMap<>();
  }

  public boolean limit(String ip, long ts) {
    if (!timestamps.containsKey(ip)) {
      timestamps.put(ip, new ArrayDeque<>());
      timestamps.get(ip).offer(ts);
      counters.put(ip, 1);
      return true;
    }

    Queue<Long> currentTimestamps = timestamps.get(ip);

    while (true) {
      if (!currentTimestamps.isEmpty() && ts - currentTimestamps.peek() > timeLimit) {
        currentTimestamps.poll();
        counters.put(ip, counters.get(ip) - 1);
      }
      else break;
    }

    if (counters.get(ip) == requestLimit) {
      return false;
    } else {
      currentTimestamps.offer(ts);
      counters.put(ip, counters.get(ip) + 1);
      return true;
    }
  }
}
