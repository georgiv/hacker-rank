package leetcode;

public class ContainerWithMostWater {
  public int maxArea(int[] height) {
    if (height.length == 2) return Math.min(height[0], height[1]);

    int res = 0;

    int left = 0;
    int right = height.length - 1;
    int width = height.length - 1;
    while (left < right) {
      int current = Math.min(height[left], height[right]) * width;
      res = Math.max(current, res);
      if (height[left] < height[right]) left++;
      else right--;
      width--;
    }

    return res;
  }
}
