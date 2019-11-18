import array.MoveZeroes;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] nums1 = new int[]{0,1,0,3,12};

		MoveZeroes.moveZeroes(nums1);

		System.out.println(Arrays.toString(nums1));
	}
}
