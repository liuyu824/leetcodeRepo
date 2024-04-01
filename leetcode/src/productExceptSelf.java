import java.util.Arrays;

public class productExceptSelf {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        productExceptSelf(nums);
    }

    public static int[] productExceptSelf(int[] nums) {
        int numsLength = nums.length;

        // 思路：左侧集合，右侧集合
        int[] leftMultiple = new int[numsLength];
        int[] rightMultiple = new int[numsLength];

        leftMultiple[0] = 1;
        for (int i = 1 ; i < numsLength ; i++){
            leftMultiple[i] = nums[i-1] * leftMultiple[i-1];
        }
        System.out.println(Arrays.toString(leftMultiple));

        rightMultiple[numsLength-1] = 1;
        for (int i = numsLength-2 ; i >= 0 ; i--){
            rightMultiple[i] = nums[i+1] * rightMultiple[i+1];
        }
        System.out.println(Arrays.toString(rightMultiple));

        for (int i = 0; i < numsLength ; i++){
            nums[i] = leftMultiple[i] * rightMultiple[i];
        }

        return nums;
    }

}
