package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


@SuppressWarnings("OptionalGetWithoutIsPresent")
public class SingleNumber {

  /**
   * Runtime: 9 ms Memory Usage: 40.4 MB Time Complexity: O(n) Space Complexity: O(n)
   */
  public static int singleNumber(int[] nums) {
    Set<Integer> singleNumbers = new HashSet<>();
    for (int num : nums) {
      if (!singleNumbers.add(num)) {
        singleNumbers.remove(num);
      }
    }
    return singleNumbers.stream().findFirst().get();
  }

  /**
   * Runtime: 3 ms Memory Usage: 38.2 MB Time Complexity: O(n*log(n)) Space Complexity: O(1)
   */
  public static int singleNumber2(int[] nums) {
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 1; i++) {
      int num = nums[i];
      if (num != nums[i + 1]) {
        return num;
      } else {
        i++;
      }
    }
    return nums[nums.length - 1];
  }

  /**
   * Runtime: 0 ms Memory Usage: 38.9 MB Time Complexity: O(n) Space Complexity: O(1)
   */
  public static int singleNumber3(int[] nums) {
    int result = nums[0];
    // XOR all elements
    for (int i = 1; i < nums.length; i++) {
      result = result ^ nums[i];
    }
    return result;
  }
}
