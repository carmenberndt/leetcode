package strings;

public class ReverseInteger {

	/**
	 * Runtime: 2 ms Memory Usage: 33.9 MB Time Complexity: O(1) Space Complexity: O(1)
	 */
	public static int reverse2(int x) {
		if (x == 0) {
			return x;
		}
		StringBuilder result = new StringBuilder();
		boolean isNegative = false;
		if (x < 0) {
			x = Math.abs(x);
			isNegative = true;
		}
		while (x > 0) {
			result.append(x % 10);
			x = x / 10;
		}
		try {
			return isNegative ? Integer.parseInt(result.toString()) * -1
				: Integer.parseInt(result.toString());
		} catch (NumberFormatException e) {
			return 0;
		}
	}

	/**
	 * Runtime: 2 ms Memory Usage: 33.9 MB Time Complexity: O(1) Space Complexity: O(1)
	 */
	public static int reverse(int x) {
		if (x == 0) {
			return 0;
		}
		int result = 0;
		boolean isNegative = x < 0;
		x = Math.abs(x);
		for (int i = (int) (Math.log10(x) + 1); i > 0; i--) {
			int num = x % 10;
			x /= 10;
			if (result + num * Math.pow(10, i - 1) > Integer.MAX_VALUE) {
				return 0;
			}
			result += num * Math.pow(10, i - 1);
		}
		return isNegative ? result * -1 : result;
	}
}
