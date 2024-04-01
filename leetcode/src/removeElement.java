import java.util.Arrays;

public class removeElement {

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        removeElement(nums,3);
    }

    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int left = 0;
        for (int right = 0; right < n; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return left;
    }
}
