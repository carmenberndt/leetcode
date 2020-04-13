package strings;

public class StringToInteger {

	/**
	 * Runtime: 1 ms
	 * Memory Usage: 39.8 MB
	 */
	public static int myAtoi(String str) {
		if (str == null) {
			return 0;
		}
		// remove leading and trailing whitespaces
		str = str.trim();
		if (str.isEmpty())
			return 0;

		int i = 0, result = 0, sign = 1;
		if (str.charAt(i) == '-') {
			sign = -1;
			++i;
		} else if (str.charAt(i) == '+') {
			++i;
		}

		for (; i < str.length(); i++) {
			int tmp = str.charAt(i) - '0';
			if (tmp < 0 || tmp > 9) {
				break;
			}
			if (result > Integer.MAX_VALUE / 10 ||
				result == Integer.MAX_VALUE / 10 && tmp > Integer.MAX_VALUE % 10) {
				return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			} else {
				result = result * 10 + tmp;
			}
		}
		return result * sign;
	}
}
