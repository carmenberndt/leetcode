package strings;

public class LongestCommonPrefix {

	/**
	 * Runtime: 0 ms Memory Usage: 37.7 MB
	 */
	public static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}
		String first = strs[0];
		for (int i = 0; i < first.length(); i++) {
			char currentChar = first.charAt(i);
			for (int j = 1; j < strs.length; j++) {
				String current = strs[j];
				if (i == current.length() || current.charAt(i) != currentChar) {
					return current.substring(0, i);
				}
			}
			if (i == first.length() - 1) {
				return first;
			}
		}
		return "";
	}
}
