package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;


public class FirstUniqueCharacterInAString {

	public static int firstUniqChar(String s) {
		if (s == null || s.equals("")) {
			return -1;
		}
		HashMap<Character, List<Integer>> uniqueCharacters = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (!uniqueCharacters.containsKey(s.charAt(i))) {
				uniqueCharacters.put(s.charAt(i), new ArrayList<>(i));
			} else {
				uniqueCharacters.get(s.charAt(i)).add(i);
			}
		}
		Optional<Entry<Character, List<Integer>>> first = uniqueCharacters.entrySet()
			.stream()
			.filter(k -> k.getValue().size() == 1)
			.findFirst();
		if (first.isEmpty()) {
			return -1;
		}
		return first.get().getValue().get(0);
	}
}
