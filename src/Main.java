public class Main {

	public static void main(String[] args) {
		int[][] parentChildPairs = new int[][] {
			{1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7},
			{4, 5}, {4, 8}, {4, 9}, {9, 11}
		};

		System.out.println(InterviewQuestion.findNodesWithZeroAndOneParents(parentChildPairs));
	}
}
