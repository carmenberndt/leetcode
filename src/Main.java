import array.ContainsDuplicate;
import array.RotateArray;
import array.SingleNumber;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] nums = new int[]{2, 2, 1};
    int[] nums2 = new int[]{4, 1, 2, 1, 2};
    int result = SingleNumber.singleNumber3(nums);
    int result2 = SingleNumber.singleNumber3(nums2);

    System.out.println(result);
    System.out.println(result2);
  }
}
