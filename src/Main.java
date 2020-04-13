import strings.LongestCommonPrefix;

public class Main {

	public static void main(String[] args) {
		String[] input = {"flower", "flow", "flight"};
		String[] input2 = {"dog", "racecar", "car"};
		String[] input3 = {"a"};

		System.out
			.println(
				"Should Be: " + "'fl', Actual: " + LongestCommonPrefix.longestCommonPrefix(input));
		System.out
			.println(
				"Should Be: " + "'', Actual: " + LongestCommonPrefix.longestCommonPrefix(input2));
		System.out
			.println(
				"Should Be: " + "'a', Actual: " + LongestCommonPrefix.longestCommonPrefix(input3));

	}
}
