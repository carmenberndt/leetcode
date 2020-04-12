package strings;

import java.util.Arrays;
import java.util.HashMap;


public class ValidAnagram {

	static int NUMBER_OF_CHARS = 26;

	/**
	 * Runtime: 3 ms Memory Usage: 39.8 MB
	 */
	public static boolean isAnagram(String s, String t) {
		if (s == null || t == null || s.length() != t.length()) {
			return false;
		}
		int[] count = new int[NUMBER_OF_CHARS];
		Arrays.fill(count, 0);

		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 'a']++;
			count[t.charAt(i) - 'a']--;
		}

		for (int i = 0; i < NUMBER_OF_CHARS; i++) {
			if (count[i] != 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Runtime: 10 ms Memory Usage: 40.3 MB
	 */
	public static boolean isAnagramFirstTry(String s, String t) {
		if (s == null || t == null || s.length() != t.length()) {
			return false;
		}
		HashMap<Character, Integer> allowedCharacters = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			Character currentChar = s.charAt(i);
			if (allowedCharacters.containsKey(currentChar)) {
				int count = allowedCharacters.get(currentChar);
				allowedCharacters.replace(currentChar, ++count);
			} else {
				allowedCharacters.put(currentChar, 1);
			}
		}
		for (int i = 0; i < s.length(); i++) {
			Character currentChar = t.charAt(i);
			if (allowedCharacters.containsKey(currentChar)) {
				int count = allowedCharacters.get(currentChar);
				if (count == 1) {
					allowedCharacters.remove(currentChar);
				} else {
					allowedCharacters.replace(currentChar, --count);
				}
			} else {
				return false;
			}
		}
		return true;
	}
}
