package array;

import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArraysII {

	/**
	 * Runtime: 1 ms Memory Usage: 37.9 MB Space Complexity: O(n + m) Time Complexity: O(n*log(n) +
	 * m*log(m))
	 */
	public static int[] intersect(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i = 0, j = 0;
		int counter = 0;
		int[] result = new int[nums1.length + nums2.length];
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] > nums2[j]) {
				j++;
			} else if (nums1[i] < nums2[j]) {
				i++;
			} else {
				// equal number
				result[counter] = nums1[i];
				counter++;
				i++;
				j++;
			}
		}
		return Arrays.copyOfRange(result, 0, counter);
	}

	/**
	 * Runtime: 2 ms Memory Usage: 37 MB Time Complexity: O(n + m) Space Complexity: O(n + m)
	 */
	public static int[] intersect2(int[] nums1, int[] nums2) {
		int[] result = new int[nums1.length + nums2.length];
		int counter = 0;
		HashMap<Integer, Integer> map = new HashMap();
		for (int item : nums1) {
			if (map.containsKey(item)) {
				int value = map.get(item);
				map.put(item, ++value);
			} else {
				map.put(item, 1);
			}
		}

		for (int i : nums2) {
			if (map.containsKey(i)) {
				int value2 = map.get(i);
				if (value2 == 1) {
					map.remove(i);
				} else {
					map.put(i, --value2);
				}
				result[counter] = i;
				counter++;
			}
		}

		return Arrays.copyOfRange(result, 0, counter);
	}
}
