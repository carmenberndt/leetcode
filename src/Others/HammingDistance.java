package Others;

public class HammingDistance {

	/**
	 * Runtime: 0 ms Memory Usage: 33 MB Time Complexity: O(1) Space Complexity: O(1)
	 */
	public static int hammingDistance(int x, int y) {
		return Integer.bitCount(x ^ y);
	}
}
