package strings;

public class ReverseString {

	/**
	 * Runtime: 1 ms Memory Usage: 51.4 MB Time Complexity: O(n) Space Complexity: O(1)
	 */
	public static void reverseString(char[] s) {
		int right = s.length - 1;
		char tmp;
		for (int i = 0; i < s.length / 2; i++) {
			tmp = s[i];
			s[i] = s[right];
			s[right] = tmp;
			right--;
		}
	}

}
