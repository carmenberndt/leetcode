package array;
import java.util.HashSet;
import java.util.Set;

/**
 * Runtime: 6 ms
 * Memory Usage: 44 MB
 * Space Complexity: O(n)
 * Time Complexity: O(n)
 */
@SuppressWarnings("ForLoopReplaceableByForEach")
public class ContainsDuplicate {
  public static boolean containsDuplicate(int[] nums) {
    Set<Integer> hashSet = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      int num = nums[i];
      if (!hashSet.add(num)) {
        return true;
      }
    }
    return false;
  }
}
