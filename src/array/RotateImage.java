package array;

public class RotateImage {

	/**
	 * Runtime: 0 ms
	 * Memory Usage: 36.2 MB
	 * Time Complexity: O(n)
	 * Space Complexity: O(1)
	 */
	public static void rotate(int[][] matrix) {
		int n = matrix.length;
		for (int i = 0; i < n / 2; i++) {
			for (int j = i; j < n - i - 1; j++) {
				int tmp = matrix[i][j];
				matrix[i][j] = matrix[n - j - 1][i];
				matrix[n - j - 1][i] = matrix[n - i - 1][n- j - 1];
				matrix[n - i - 1][n - j - 1] = matrix[j][n-i-1];
				matrix[j][n-i-1] = tmp;
			}
		}
	}
}
