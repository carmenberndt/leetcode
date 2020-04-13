import strings.ImplementstrStr;

public class Main {

	public static void main(String[] args) {
		String hayStack = "hello";
		String needle = "ll";

		String hayStack2 = "aaaaa";
		String needle2 = "bba";

		String hayStack3 = "mississippi";
		String needle3 = "issipi";

		System.out
			.println("Should Be: " + "2, Actual: " + ImplementstrStr.strStr(hayStack, needle));
		System.out
			.println("Should Be: " + "-1, Actual: " + ImplementstrStr.strStr(hayStack2, needle2));
		System.out
			.println("Should be: -1, Actual: " + ImplementstrStr.strStr(hayStack3, needle3));

	}
}
