public class isHappy {

    public static void main(String[] args) {
        int n = 19;
        boolean isHappy = isHappy(n);
        System.out.println(isHappy);
    }

    public static boolean isHappy(int n) {
        String strN = String.valueOf(n);
        int nLength = strN.length();
        if (nLength == 1){
            return false;
        }
        boolean returnBool = happy(strN);
        return returnBool;
    }

    public static boolean happy(String n){
        int sum = 0;
        int nLength = n.length();
        for (int i = 0; i < nLength; i++){
            int pow = n.charAt(i)*n.charAt(i);
            sum += pow;
        }
        if (sum == 1){
            return true;
        } else {
            happy(String.valueOf(sum));
        }
        return false;
    }
}
