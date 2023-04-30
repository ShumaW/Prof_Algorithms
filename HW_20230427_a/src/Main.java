public class Main {

    public static void main(String[] args) {
//        int[] arr1 = {1, 1, 2, 3, 3, 3, 4, 5, 4};
//        int[] arr2 = {9, 9, 8, 7, 6, 6, 5, 5, 5, 5, 5, 5};
//        System.out.println(monotoniсArray(arr1));
//        System.out.println(monotoniсArray(arr2));

        String s = "abbbstrarts";
        System.out.println(longestPolin(s));

    }

    /**
     * [1 1 2 3 3 3 4 5 6]
     * [9 9 8 7 6 6 5 5 5 5 5 5]
     * [1 1 2 2 3 4 5 4]
     */

    public static boolean monotoniсArray(int[] arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] < arr[i + 1]){
//                return false;
//            }
//            if (arr[i] > arr[i + 1]){
//                return false;
//            }
//        }
//        return true;

        boolean up = true;
        boolean down = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) up = false;
            if (arr[i] < arr[i + 1]) down = false;
        }
        if (up) return true;
        if (down) return true;
        return false;
    }

    /**
     * String s = ""abbbstrrts";
     * out - "strrts"
     * <p>
     * String s = "cbba"
     * out - "bb"
     */

    public static String longestPolin(String s) {
        String longestPolin = "";

        char[] charArray = s.toCharArray();
        int left;
        int right;


        for (int i = 0; i < charArray.length; i++) {
            StringBuilder currentPol = new StringBuilder();
            String temp = "";

            left = i;
            right = charArray.length - 1;
            while (left < right) {
                if (charArray[left] == charArray[right]) {
                    currentPol.append(charArray[left]);
                    left++;
                }
                right--;
            }
            String tempStr1 = currentPol.toString();
            if (left == right) {
                currentPol.append(charArray[left]);
            }
            String tempStr2 = currentPol.reverse().toString();
            temp = tempStr1 + tempStr2;

            longestPolin = (longestPolin.length() > temp.length()) ? longestPolin : temp;

        }

        return longestPolin;

    }

}