import array.TwoSum;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] nums1 = new int[]{2, 7, 11, 15};

		int[] result = TwoSum.twoSum(nums1, 9);

		System.out.println(Arrays.toString(result));
	}
}
