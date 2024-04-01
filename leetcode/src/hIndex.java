public class hIndex {

    public static void main(String[] args) {

        int[] nums = new int[]{3,0,6,1,5};
        int i = hIndex(nums);
        System.out.println(i);
    }

    public static int hIndex(int[] citations) {
        int numsLength = citations.length;
        int returnNum = 0;

        for (int i = 0; i < numsLength; i++) {
            // 第一次遍历，用于筛选
            int j = 0;
            for (int k = 0; k < numsLength; k++) {
                if (citations[k] > i){
                    j++;
                    if (j>i){
                        returnNum = j;
                        break;
                    }
                }
            }
        }
        return returnNum;
    }
}
