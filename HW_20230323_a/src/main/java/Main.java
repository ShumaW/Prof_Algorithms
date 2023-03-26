public class Main {
    public static void main(String[] args) {

        /**
         * [ 1 2 3 4 5 6 7 8 9] --sort
         * int x = 11
         * Есть отсортированный массив рандомных чисел
         * Есть число
         *
         * Найти все пары чисел которые в сумме дают это число
         */

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int x = 7;
        findPair(arr, x);
    }

    public static void findPair(int[] arr, int x){
        int left = arr[0];
        int right = arr[arr.length - 1];

        while (left < right){
            int temp = left + right;
            if (temp == x){
                System.out.println("(" + left + ", " + right + ")");
                left++;
                right--;
            } else if (temp < x) {
                left++;
            } else {
                right--;
            }
        }
    }
}