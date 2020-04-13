package strings;

public class ImplementstrStr {

	/**
	 * Runtime: 1 ms
	 * Memory Usage: 37.9 MB
	 */
	public static int strStr(String hayStack, String needle) {
		if (needle.isEmpty()) {
			return 0;
		}
		int hayStackLength = hayStack.length();
		int needleLength = needle.length();
		for (int i = 0; i < hayStackLength; i++) {
			if (i + needleLength > hayStackLength) {
				break;
			}
			for (int j = 0; j < needleLength; j++) {
				if (hayStack.charAt(i + j) != needle.charAt(j)) {
					break;
				}
				if (j == needleLength - 1) {
					return i;
				}
			}
		}
		return -1;
	}

}
