import java.util.Arrays;
import strings.ReverseString;

public class Main {

	public static void main(String[] args) {
		char[] s = {'h', 'e', 'l', 'l', 'o'};
		char[] s1 = {'H', 'a', 'n', 'n', 'a', 'h'};

		ReverseString.reverseString(s);
		ReverseString.reverseString(s1);

		System.out.println(Arrays.toString(s));
		System.out.println(Arrays.toString(s1));
	}
}
