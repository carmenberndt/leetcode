package array;

import java.util.HashMap;
import java.util.HashSet;

public class ValidSudoku {

	/**
	 * Runtime: 3 ms Memory Usage: 44.4 MB Time Complexity: O(1) Space Complexity: O(1)
	 */
	public static boolean isValidSudoku(char[][] board) {
		if (board.length == 0) {
			return false;
		}
		// check each row and column
		HashMap<Integer, HashSet<Integer>> numbersInEachColumn = new HashMap<>();
		for (int n = 0; n < 9; n++) {
			numbersInEachColumn.put(n, new HashSet<>());
		}
		for (char[] row : board) {
			HashSet<Integer> numbersPerRow = new HashSet<>();
			for (int j = 0; j < 9; j++) {
				if (row[j] != '.') {
					if (!numbersPerRow.add(Character.getNumericValue(row[j]))
						|| !numbersInEachColumn.get(j).add(Character.getNumericValue(row[j]))) {
						return false;
					}
				}
			}
		}
		// check each of the 9 3x3 sub-boxes
		for (int i = 0; i < 3; i++) { // begin of next box row
			for (int k = 0; k < 3; k++) { // begin of next box column
				HashSet<Integer> numbersPerBox = new HashSet<>();
				for (int m = 3 * k; m < 3 * k + 3; m++) { // row
					for (int n = 3 * i; n < 3 * i + 3; n++) { // column
						if (board[m][n] != '.' && !numbersPerBox
							.add(Character.getNumericValue(board[m][n]))) {
							return false;
						}
					}
				}
			}
		}
		return true;
	}

}
