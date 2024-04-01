import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class reverseWords {

    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        StringBuffer finalStr = new StringBuffer();
        String[] splitS = s.split(" ");
        int splitLength = splitS.length;

        Map<Integer,String> map = new HashMap<>();
        int j = 0;
        for (int i = splitLength-1; i >= 0; i--) {
            System.out.println(splitS[i]);
            if (!splitS[i].equals("")){
                System.out.println("非空内部执行了");
                map.put(j,splitS[i]);
                j++;
            }
        }
        System.out.println(map);
        System.out.println(j);
        for (int i = (j-1); i >= 0; i--) {
            if (i == (j-1)){
                finalStr.append(map.get(i));
            } else {
                finalStr.append(" "+map.get(i));
            }

        }

        return String.valueOf(finalStr);
    }
}
