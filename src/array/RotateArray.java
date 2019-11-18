package array;

public class RotateArray {
  public static void rotate(int[] nums, int k) {
    int length = nums.length;
    if(k == length || k == 0) return;

    if(nums.length < k) {
      k -= nums.length;
    }

    int lengthOfPartedArray = length - k;

    reverse(nums, 0, lengthOfPartedArray - 1);
    reverse(nums, lengthOfPartedArray, length - 1);
    reverse(nums, 0, length - 1);
  }

  private static void reverse(int[] n, int left, int right) {
    if(n.length == 0 || n.length == 1) {
      return;
    }
    int tmp;
    while (left < right) {
      tmp = n[left];
      n[left] = n[right];
      n[right] = tmp;
      left++;
      right--;
    }
  }
}
