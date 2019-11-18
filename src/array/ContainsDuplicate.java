package array;
import java.util.HashSet;
import java.util.Set;

/**
 * Runtime: 9 ms
 * Memory Usage: 44.2 MB
 * Space Complexity: O(n)
 * Time Complexity: O(n)
 */
public class ContainsDuplicate {
  public static boolean containsDuplicate(int[] nums) {
    Set<Integer> hashSet = new HashSet<>();
    for (int num : nums) {
      if (hashSet.contains(num))
        return true;
      hashSet.add(num);
    }
    return false;
  }
}
