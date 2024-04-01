import java.util.Arrays;

public class lengthOfLongestSubstring {

    public static void main(String[] args) {

        String s = "bbbbb";
        int i = lengthOfLongestSubstring(s);
        System.out.println(i);

    }

    public static int lengthOfLongestSubstring(String s) {

        int strNum = s.length();
        int finalStrNum = 0;
        for (int i = 0 ; i < strNum ; i++){
            String str1 = String.valueOf(s.charAt(i));
            for (int j = i + 1; j < strNum; j++){
                String str2 = String.valueOf(s.charAt(j));
                if (!str1.contains(str2)){
                    str1 += str2;
                    if (str1.length() > finalStrNum){
                        finalStrNum = str1.length();
                    }
                } else {
                    break;
                }
            }
        }
        return finalStrNum;
    }
}
