package leetcode;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, List<Integer>> indices = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      if (!indices.containsKey(nums[i])) indices.put(nums[i], new ArrayList<>());
      indices.get(nums[i]).add(i);
    }

    int[] res = new int[2];

    for (int i = 0; i < nums.length; i++) {
      if (!indices.containsKey(target - nums[i])) continue;

      if (target - nums[i] == nums[i] && indices.get(nums[i]).size() == 1) continue;

      res[0] = i;
      if (target - nums[i] == nums[i]) res[1] = indices.get(nums[i]).get(1);
      else res[1] = indices.get(target - nums[i]).get(0);
      break;
    }

    return res;
  }
}
