import array.ContainsDuplicate;
import array.IntersectionOfTwoArraysII;
import array.RotateArray;
import array.SingleNumber;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] nums1 = new int[]{1, 2, 2, 1};
		int[] nums2 = new int[]{2, 2};
		int[] result = IntersectionOfTwoArraysII.intersect(nums1, nums2);

		System.out.println(Arrays.toString(result));
	}
}
