import array.ContainsDuplicate;
import array.RotateArray;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] nums = new int[] {1,2,3,4};
    int[] nums2 = new int[] {1, 2, 3, 4, 1};
    int[] nums3 = new int[] {1,1,1,3,3,4,3,2,4,2};
    boolean result = ContainsDuplicate.containsDuplicate(nums);
    boolean result2 = ContainsDuplicate.containsDuplicate(nums2);
    boolean result3 = ContainsDuplicate.containsDuplicate(nums3);

    System.out.println(result);
    System.out.println(result2);
    System.out.println(result3);
  }
}
