import java.util.HashMap;

public class roman2Values {

    public static void main(String[] args) {

        /**
         * 字符          数值
         * I             1
         * V             5
         * X             10
         * L             50
         * C             100
         * D             500
         * M             1000
         */
        HashMap<Integer,String> symbolValues = new HashMap<>();
        symbolValues.put(1,"I");
        symbolValues.put(4,"IV");
        symbolValues.put(5,"V");
        symbolValues.put(9,"IX");
        symbolValues.put(10,"X");
        symbolValues.put(40,"XL");
        symbolValues.put(50,"L");
        symbolValues.put(90,"XC");
        symbolValues.put(100,"C");
        symbolValues.put(400,"CD");
        symbolValues.put(500,"D");
        symbolValues.put(900,"CM");
        symbolValues.put(1000,"M");

        String finalStr = "";
        int num =3;
        // 一层一层往下减
        while((num - 1000) >= 0){
            finalStr += symbolValues.get(1000);
            num -= 1000;
        }
        while((num - 900) >= 0){
            finalStr += symbolValues.get(900);
        }
        while((num - 500) >= 0){
            finalStr += symbolValues.get(500);
        }
        while((num - 400) >= 0){
            finalStr += symbolValues.get(400);
        }
        while((num - 100) >= 0){
            finalStr += symbolValues.get(100);
        }
        while((num - 90) >= 0){
            finalStr += symbolValues.get(90);
        }
        while((num - 50) >= 0){
            finalStr += symbolValues.get(50);
        }
        while((num - 40) >= 0){
            finalStr += symbolValues.get(40);
        }
        while((num - 10) >= 0){
            finalStr += symbolValues.get(10);
        }
        while((num - 9) >= 0){
            finalStr += symbolValues.get(9);
        }
        while((num - 5) >= 0){
            finalStr += symbolValues.get(5);
        }
        while((num - 4) >= 0){
            finalStr += symbolValues.get(4);
        }
        while((num - 1) >= 0){
            finalStr += symbolValues.get(1);
        }

        System.out.println(finalStr);

    }
}
