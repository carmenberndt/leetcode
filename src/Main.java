import strings.CountAndSay;

public class Main {

	public static void main(String[] args) {
		int input = 1;
		int input2 = 4;

		System.out
			.println(
				"Should Be: " + "1, Actual: " + CountAndSay.countAndSay(input));
		System.out
			.println(
				"Should Be: " + "1211, Actual: " + CountAndSay.countAndSay(input2));

	}
}
