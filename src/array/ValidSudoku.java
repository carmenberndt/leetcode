package array;

import java.util.HashMap;
import java.util.HashSet;

public class ValidSudoku {

	/**
	 * Runtime: 3 ms Memory Usage: 44.4 MB Time Complexity: O(1) Space Complexity: O(1)
	 */
	public static boolean isValidSudoku(char[][] board) {
		if (board.length != 9) {
			return false;
		}
		// check each row and column
		HashMap<Integer, HashSet<Integer>> numbersInEachColumn = new HashMap<>();
		HashMap<Integer, HashSet<Integer>> numbersInEachBox = new HashMap<>();
		for (int n = 0; n < 9; n++) {
			numbersInEachColumn.put(n, new HashSet<>());
			numbersInEachBox.put(n, new HashSet<>());
		}
		for (int i = 0; i < 9; i++) {
			HashSet<Integer> numbersPerRow = new HashSet<>();
			for (int j = 0; j < 9; j++) {
				if (board[i][j] != '.') {
					int num = Character.getNumericValue(board[i][j]);
					if (!numbersPerRow.add(num)
						|| !numbersInEachColumn.get(j).add(num)
						|| !numbersInEachBox.get(i / 3 + (j / 3) * 3).add(num)) {
						return false;
					}
				}
			}
		}
		return true;
	}

}
