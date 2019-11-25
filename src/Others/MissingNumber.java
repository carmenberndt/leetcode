package Others;

import java.util.HashSet;

public class MissingNumber {

	/**
	 * Runtime: 0 ms Memory Usage: 38.7 MB Time Complexity: O(n) Space Complexity: O(1)
	 */
	public static int missingNumber(int[] nums) {
		int missing = 0;
		int i = 0;
		for (i = 0; i < nums.length; i++) {
			missing = missing ^ i ^ nums[i];
		}
		return missing ^ i;
	}
}
