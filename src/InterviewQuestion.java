import java.util.*;

/*
Suppose we have some input data describing a graph of relationships between parents and children over multiple generations.
The data is formatted as a list of (parent, child) pairs, where each individual is assigned a unique integer identifier.

For example, in this diagram, 3 is a child of 1 and 2, and 5 is a child of 4:

1   2    4
 \ /   / | \
  3   5  8  9
   \ / \     \
    6   7    11

Sample input/output (pseudodata):
parentChildPairs = [
    (1, 3), (2, 3), (3, 6), (5, 6),
    (5, 7), (4, 5), (4, 8), (4, 9), (9, 11)
]

Write a function that takes this data as input and returns two collections:
one containing all individuals with zero known parents, and one containing all individuals with exactly one known parent.

Output may be in any order:
findNodesWithZeroAndOneParents(parentChildPairs) => [
  [1, 2, 4],       // Individuals with zero parents
  [5, 7, 8, 9, 11] // Individuals with exactly one parent
]

n: number of pairs in the input
*/

public class InterviewQuestion {

	public static List<List<Integer>> findNodesWithZeroAndOneParents(int[][] parentChildPairs) {
		HashMap<Integer, HashSet<Integer>> childToParents = new HashMap<>();
		for (int[] parentChildPair : parentChildPairs) {

			if (!childToParents.containsKey(parentChildPair[0])) {
				childToParents.put(parentChildPair[0], new HashSet<>());
			}
			if (!childToParents.containsKey(parentChildPair[1])) {
				childToParents.put(parentChildPair[1], new HashSet<>());
			}
			childToParents.get(parentChildPair[1]).add(parentChildPair[0]);
		}
		List<Integer> zeroParents = new ArrayList<>();
		List<Integer> oneParent = new ArrayList<>();
		for (Map.Entry<Integer, HashSet<Integer>> entry : childToParents.entrySet()) {
			if (entry.getValue().isEmpty()) {
				zeroParents.add(entry.getKey());
			}
			if (entry.getValue().size() == 1) {
				oneParent.add(entry.getKey());
			}
		}
		List<List<Integer>> result = new ArrayList<>();
		result.add(zeroParents);
		result.add(oneParent);
		return result;
	}

}

// zgtt