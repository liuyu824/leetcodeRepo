import java.util.*;

public class simplifyPath {

    public static void main(String[] args) {
        String s = "/home//foo/";
        String s1 = simplifyPath(s);
        System.out.println("输出值为："+s1);
    }

    public static String simplifyPath(String path) {

        Deque<String> stack = new LinkedList<>();
        String[] splitS = path.split("/");
        System.out.println(Arrays.toString(splitS));
        int splitLength = splitS.length;
        StringBuffer finalStr = new StringBuffer();

        for (int i = 0; i < splitLength; i++){
            System.out.println("当前值为"+splitS[i]);
            if (Objects.equals(splitS[i], "/") || Objects.equals(splitS[i], "")){
                System.out.println("第一层判断");
            } else if (Objects.equals(splitS[i],".") || Objects.equals(splitS[i], "..")){
                System.out.println("第二层判断");
                if (!stack.isEmpty()){
                    stack.pop();
                }
            } else {
                System.out.println("第三层判断");
                stack.push(splitS[i]);
            }
        }

        // 使用iterator遍历stack
        Iterator<String> iterator = stack.iterator();
        while (iterator.hasNext()) {
            finalStr.append("/").append(iterator.next());
        }

        return String.valueOf(finalStr);
    }

}
