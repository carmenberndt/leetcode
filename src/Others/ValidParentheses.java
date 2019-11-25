package Others;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

	private static HashMap<Character, Character> bracketCombinations = new HashMap<>();
	static {
		bracketCombinations.put('(', ')');
		bracketCombinations.put('{', '}');
		bracketCombinations.put('[', ']');
	}

	/**
	 * Runtime: 2 ms
	 * Memory Usage: 34.5 MB
	 * Time Complexity: O(n)
	 * Space Complexity: O(n)
	 */
	public static boolean isValid(String s) {
		if (s == null || s.isEmpty()) return true;
		Stack<Character> characterStack = new Stack<>();
		characterStack.push(s.charAt(0));
		for (int i = 1; i < s.length(); i++) {
			Character next = s.charAt(i);
			if (characterStack.empty() || bracketCombinations.containsKey(next)) {
				characterStack.push(next); // (])
				continue;
			}
			Character topElement = characterStack.peek();
			if (bracketCombinations.get(topElement) == next) {
					characterStack.pop();
			} else {
				characterStack.push(next);
			}
		}
		return characterStack.empty();
	}

}
