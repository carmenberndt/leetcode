package array;

public class MoveZeroes {

	/**
	 * Runtime: 0 ms Memory Usage: 37.8 MB Time Complexity: O(n) Space Complexity: O(1)
	 */
	public static void moveZeroes(int[] nums) {
		if (nums == null || nums.length == 0) {
			return;
		}

		int insertPos = 0;
		// shift non-zero values forward
		for (int num : nums) {
			if (num != 0) {
				nums[insertPos++] = num;
			}
		}
		// fill remaining space with zeroes
		while (insertPos < nums.length) {
			nums[insertPos++] = 0;
		}
	}
}
