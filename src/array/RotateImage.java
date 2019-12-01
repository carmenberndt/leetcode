package array;

public class RotateImage {

	/**
	 * Runtime: 0 ms Memory Usage: 36.2 MB Time Complexity: O(n^2) Space Complexity: O(1)
	 */
	public static void rotate(int[][] matrix) {
		if (matrix.length == 0 || matrix.length != matrix[0].length) {
			return;
		}
		int n = matrix.length;
		for (int layer = 0; layer < n / 2; layer++) {
			int first = layer;
			int last = n - 1 - layer;
			for (int i = first; i < last; i++) {
				int offset = i - first;
				int top = matrix[first][i]; // save top

				// left -> top
				matrix[first][i] = matrix[last - offset][first];

				// bottom -> left
				matrix[last - offset][first] = matrix[last][last - offset];

				// right -> bottom
				matrix[last][last - offset] = matrix[i][last];

				// top -> right
				matrix[i][last] = top;
			}
		}
	}
}
