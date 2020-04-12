package strings;

public class ValidPalindrome {

	/**
	 * Runtime: 2 ms
	 * Memory Usage: 39.8 MB
	 */
	public static boolean isPalindrome(String s) {
		if (s == null || s.isEmpty()) {
			return true;
		}
		int j = s.length() - 1;
		for (int i = 0; i < j; i++) {
			char first = s.charAt(i);
			char last = s.charAt(j);
			while(!Character.isLetterOrDigit(first) && i < j ) {
				first = s.charAt(++i);
			}
			while(!Character.isLetterOrDigit(last) && i < j) {
				last = s.charAt(--j);
			}
			if (Character.toLowerCase(first) != Character.toLowerCase(last)) {
				return false;
			}
			j--;
		}
		return true;
	}
}
