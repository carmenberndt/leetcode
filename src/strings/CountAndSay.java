package strings;

public class CountAndSay {

	/**
	 * Runtime: 1 ms
	 * Memory Usage: 36.3 MB
	 */
	public static String countAndSay(int n) {
		if (n == 1) {
			return "1";
		}
		StringBuilder result = new StringBuilder();
		String tmp = countAndSay(n - 1);
		for (int i = 0, count = 1; i < tmp.length(); i++, count++) {
			if (i == tmp.length() -1 || tmp.charAt(i + 1) != tmp.charAt(i)) {
				result.append(count).append(tmp.charAt(i));
				count = 0;
			}
		}
		return result.toString();
	}
}
