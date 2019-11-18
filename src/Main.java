import array.ContainsDuplicate;
import array.IntersectionOfTwoArraysII;
import array.PlusOne;
import array.RotateArray;
import array.SingleNumber;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] nums1 = new int[]{1, 2, 2, 1};
		int[] nums2 = new int[]{2, 0};
		int[] nums3 = new int[]{2, 0, 9};

		int[] result1 = PlusOne.plusOne(nums1);
		int[] result2 = PlusOne.plusOne(nums2);
		int[] result3 = PlusOne.plusOne(nums3);

		System.out.println(Arrays.toString(result1));
		System.out.println(Arrays.toString(result2));
		System.out.println(Arrays.toString(result3));

	}
}
