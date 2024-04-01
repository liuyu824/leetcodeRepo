import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesII {

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,1,2,3,3};
        int i = removeDuplicates(nums);
        System.out.println(i);
    }

    public static int removeDuplicates(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int finalLength = 0;
        int numsLength = nums.length;
        for (int i = 0; i < numsLength ; i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i],1);
                finalLength += 1;
            } else if (map.get(nums[i]) == 1){
                map.replace(nums[i],2);
                finalLength += 1;
            }
        }
        nums = new int[finalLength];
        int j = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() == 1){
                nums[j] = entry.getKey();
                j++;
            } else if (entry.getValue() == 2){
                nums[j] = entry.getKey();
                nums[j+1] = entry.getKey();
                j += 2;
            }
        }
        return finalLength;
    }
}
