import strings.StringToInteger;

public class Main {

	public static void main(String[] args) {
		String s = " ";
		String t = "   -42";
		String u = "4193 with words";
		String v = "words and 987";
		String w = "-91283472332";

		System.out.println("Should Be: " + "0, Actual: " + StringToInteger.myAtoi(s));
		System.out.println("Should Be: " + "-42, Actual: " + StringToInteger.myAtoi(t));
		System.out.println("Should Be: " + "4193, Actual: " + StringToInteger.myAtoi(u));
		System.out.println("Should Be: " + "0, Actual: " + StringToInteger.myAtoi(v));
		System.out.println("Should Be: " + "-2147483648, Actual: " + StringToInteger.myAtoi(w));


	}
}
