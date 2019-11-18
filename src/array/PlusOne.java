package array;

import java.util.Arrays;

public class PlusOne {

	/**
	 * Runtime: 0 ms Memory Usage: 35 MB Time Complexity: O(n) Space Complexity: O(n)
	 */
	public static int[] plusOne(int[] digits) {
		int length = digits.length;
		int lastElement = digits[length - 1];
		if (lastElement != 9) {
			digits[length - 1]++;
			return digits;
		}
		int[] result = new int[length + 1];
		digits[length - 1] = 0;
		for (int i = length - 2; i >= 0; i--) {
			if (digits[i] != 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		if (digits[0] == 0) {
			result[0] = 1;
			return result;
		}
		return digits;
	}
}
