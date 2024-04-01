import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class majorityElement {

    public static void main(String[] args) {

        int[] nums = new int[]{1};
        int i = majorityElement(nums);
        System.out.println(i);

    }

    public static int majorityElement(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();

        int arrNum = nums.length;
        int finalNum = 0;
        for (int i = 0; i < arrNum ; i++){
            Integer i1 = map.get(nums[i]);
            if (i1 == null){
                map.put(nums[i],1);
            } else {
                map.replace(nums[i],i1+1);
                if ((i1+1)> (arrNum/2)){
                    finalNum = nums[i];
                }
            }
        }
        return finalNum;
    }

}
