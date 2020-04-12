import strings.ValidAnagram;

public class Main {

	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		String s2 = "rat";
		String t2 = "car";

		System.out.println(ValidAnagram.isAnagram(s, t));
		System.out.println(ValidAnagram.isAnagram(s2, t2));


	}
}
