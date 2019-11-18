package array;

import java.util.HashMap;


public class TwoSum {

	/**
	 * Runtime: 2 ms
	 * Memory Usage: 38.5 MB
	 * Time Complexity:
	 *  Space Complexity:
	 */
	public static int[] twoSum(int[] nums, int target){
		HashMap<Integer, Integer> map = new HashMap<>();
		// check each element in array
		for(int i = 0; i < nums.length; i++) {
			//calculate remaining value
			int remain = target - nums[i];
			if (map.containsKey(remain)) {
				return new int[]{map.get(remain), i};
			}
			map.put(nums[i], i);
		}
		throw new UnsupportedOperationException();
	}
}
