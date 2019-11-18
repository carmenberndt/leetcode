package array;

import java.util.HashSet;
import java.util.Set;


@SuppressWarnings("ForLoopReplaceableByForEach")
public class ContainsDuplicate {

	/**
	 * Runtime: 6 ms Memory Usage: 44 MB Space Complexity: O(n) Time Complexity: O(n)
	 */
	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> hashSet = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (!hashSet.add(nums[i])) {
				return true;
			}
		}
		return false;
	}
}
