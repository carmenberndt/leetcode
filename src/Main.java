
import Others.ValidParentheses;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		System.out.println(ValidParentheses.isValid("()"));
		System.out.println(ValidParentheses.isValid("()[]{}"));
		System.out.println(ValidParentheses.isValid("([)]"));
		System.out.println(ValidParentheses.isValid("{[]}"));


	}
}
