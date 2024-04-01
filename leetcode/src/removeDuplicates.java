import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class removeDuplicates {

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        int i = removeDuplicates(nums);
        System.out.println(i);
        System.out.println(Arrays.toString(nums));
    }

//    public static int removeDuplicates(int[] nums) {
//        Map<Integer,Integer> map = new HashMap<>();
//        int j = 0;
//        for (int i = 0; i < nums.length ; i++){
//            if (!map.containsKey(nums[i])){
//                System.out.println("内部执行了");
//                System.out.println(i+"-key:"+nums[i]+",value:"+j);
//                map.put(nums[i],j);
//                j++;
//            }
//        }
//
//        nums = new int[j];
//        System.out.println();
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            System.out.print("value"+entry.getValue());
//            System.out.println("-key"+entry.getKey());
//            nums[entry.getValue()] = entry.getKey();
//        }
//        System.out.println(Arrays.toString(nums));
//        return nums.length;
//    }

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int fast = 1, slow = 1;
        while (fast < n) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }

}
