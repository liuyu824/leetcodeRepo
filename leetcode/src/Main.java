import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flow","flight"};
        int strsLength = strs.length;
        int minLength = strs[0].length();
        for(int i = 0 ; i < strsLength ; i++){
            minLength = Math.min(minLength,strs[i].length());
        }
        String returnStr = "";
        String char0 = "";
        for(int i = 0; i < minLength ; i++){
            for(int j = 0; j < strsLength-1; j++){
                char0 = String.valueOf(strs[j].charAt(i));
                if(strs[j].charAt(i) != strs[j+1].charAt(i)){
                    char0 = "";
                    break;
                }
            }
            returnStr += char0;
        }
        System.out.println(returnStr);
    }
}