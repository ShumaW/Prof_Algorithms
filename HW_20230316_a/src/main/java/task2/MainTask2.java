package task2;

import java.util.Arrays;

public class MainTask2 {
    /**
     * String[] sa = {"2,5", "1-3,8", "4", "5-9", "7,9-2"};
     * String[] newA = {"25", "1238", "4", "56789", "798765432"};
     * Преобразовать массив |sa| в массив |newA|
     */

    public static void main(String[] args) {
        String[] sa = {"2,5", "1-3,8", "4", "5-9", "7,9-2"};
        System.out.println(Arrays.toString(sa));

        String[] newA = Arrays.stream(sa).map(MainTask2::conversionString).toArray(String[]::new);

        System.out.println(Arrays.toString(newA));


    }

    public static String conversionString(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        for (String s : str.split(",")){
            //        for (int i = 0; i < str.length(); i++) {

//            for (int k = 0; k < split1.length; k++) {
//                split2 = split1[k].split("-");
//            }
            String[] split = s.split("-", 2);

            if (split.length == 1) {

                stringBuilder.append(split[0]);
            } else {
                int a = Integer.parseInt(split[0]);
                int b = Integer.parseInt(split[1]);
                int c = (a > b) ? -1 : 1;
                for (int j = a; j < b || j > b; j += c) {
                    stringBuilder.append(j);
                }
                stringBuilder.append(b);
            }
        }
        return stringBuilder.toString();
    }
}
