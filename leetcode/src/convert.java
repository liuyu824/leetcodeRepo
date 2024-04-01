import java.util.Arrays;

public class convert {

    public static void main(String[] args) {
        String s = "A";
        String convert = convert(s, 1);
        System.out.println(convert);
    }

    public static String convert(String s, int numRows) {
        // 获取字符串的长度，和行数
        int n = s.length();
        int r = numRows;
        System.out.println("n的值为"+n);
        // 周期值
        int t = 2*r-2;
        int c = (n+t)/t*(r-1);

        // 创建一个矩阵
        char[][] charArr = new char[r][c];
        for (int i = 0, x = 0, y = 0; i < n; i++) {
            charArr[x][y] = s.charAt(i);
            if (i % t < r-1){
                x++;
            } else {
                x--;
                y++;
            }
        }

        StringBuffer sBuffer = new StringBuffer();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (charArr[i][j] != 0){
                    sBuffer.append(charArr[i][j]);
                }
            }
        }

        return String.valueOf(sBuffer);
    }
}
