package strings;
import java.util.HashSet;

public class FirstUniqueCharacterInAString {

	/**
	 * Runtime: 7 ms
	 * Memory Usage: 39.8 MB
	 */
	public static int firstUniqChar(String s) {
		if (s == null || s.equals("")) {
			return -1;
		}
		int[] characters = new int[256]; // number of chars
		for (int i = 0; i <  s.length(); i++) {
			characters[s.charAt(i)]++;
		}
		for (int i = 0; i < s.length(); i++) {
			if (characters[s.charAt(i)] == 1) {
				return i;
			}
		}
		return -1;
	}


	/**
	 * Runtime: 22 ms
	 * Memory Usage: 40.4 MB
	 */
	public static int firstUniqCharFirstTry(String s) {
		if (s == null || s.equals("")) {
			return -1;
		}
		HashSet<Character> characters = new HashSet<>();
		HashSet<Character> notUniqueCharacters = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			if (!characters.contains(s.charAt(i))) {
				characters.add(s.charAt(i));
			} else {
				notUniqueCharacters.add(s.charAt(i));
			}
		}
		for (int i = 0; i < s.length(); i++) {
			if(!notUniqueCharacters.contains(s.charAt(i))) {
				return i;
			}
		}
		return -1;
	}
}
