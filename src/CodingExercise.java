import java.awt.Point;

public class CodingExercise {

	/**
	 * Assumption: The grid is cylindrical, i.e. it wraps around on the left/right edge but not on the up down edges.
	 * If the next move would take the cursor out of the grid (i.e. top or bottom), then the move should be skipped.
	 *
	 * // Tests:
	 * 	// Input: (3, 0, 0,"RDD")
	 * 	// Output: [2,1]
	 * 	//
	 * 	// Input: (3, 1, 0, "LLUU")
	 * 	// Output: [0,1]
	 *
	 * @param dimension: the dimension 'a' of a 2-dimensional grid (a*a)
	 * @param x: the x coordinates of the starting point
	 * @param y: the y coordinates of the starting point
	 * @param moves: string of characters from this set: {'U','D','L','R'}; each character represents Up, Down, Left, Right.
	 * @return the coordinates of the location where the cursor would be if you applied the movements represented in the string
	 */
	static int[] calculateLocation(int dimension, int x, int y, String moves) {
		Point point = new Point(x, y);
		for (int i = 0; i < moves.length(); i++) {
			switch (moves.charAt(i)) {
				case 'U':
					if (point.x != 0) {
						point.move(point.x - 1, point.y);
					}
					continue;
				case 'D':
					if (point.x != dimension - 1) {
						point.move(point.x + 1, point.y);
					}
					continue;
				case 'L':
					if (point.y != 0) {
						point.move(point.x, point.y - 1);
					} else {
						point.move(point.x, dimension - 1);
					}
					continue;
				case 'R':
					if (point.y != dimension - 1) {
						point.move(point.x, point.y + 1);
					} else {
						point.move(point.x, 0);
					}
					continue;
				default:
					throw new IllegalArgumentException("Only characters from this set: {'U','D','L','R'} are allowed moves.");
			}
		}
		return new int[]{point.x, point.y};
	}
}
