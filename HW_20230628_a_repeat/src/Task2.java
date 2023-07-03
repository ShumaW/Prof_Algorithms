import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] digits1 = {1,2,3};
        System.out.println(Arrays.toString(addOneToArray(digits1, digits1.length)));
        int[] digits2 = {4,3,2,1};
        System.out.println(Arrays.toString(addOneToArray(digits2, digits2.length)));
        int[] digits3 = {9};
        System.out.println(Arrays.toString(addOneToArray(digits3, digits3.length)));
        int[] digits4 = {1,9};
        System.out.println(Arrays.toString(addOneToArray(digits4, digits4.length)));
        int[] digits5 = {4,5,1,9};
        System.out.println(Arrays.toString(addOneToArray(digits5, digits5.length)));

    }

    /**
     * Task 2*. Дано число, которое задано своими разрядами, расположенными в массиве. Прибавить к этому числу 1.
     * Example 1:
     * Input: digits = [1,2,3]
     * Output: [1,2,4]
     * Explanation: The array represents the integer 123. Incrementing by one gives 123 + 1 = 124.
     * Thus, the result should be [1,2,4].
     * <p>
     * <p>
     * Example 2:
     * Input: digits = [4,3,2,1]
     * Output: [4,3,2,2]
     * Explanation: The array represents the integer 4321. Incrementing by one gives 4321 + 1 = 4322.
     * Thus, the result should be [4,3,2,2].
     * <p>
     * <p>
     * Example 3:
     * Input: digits = [9]
     * Output: [1,0]
     * Explanation: The array represents the integer 9. Incrementing by one gives 9 + 1 = 10.
     * Thus, the result should be [1,0].
     */

    public static int[] addOneToArray(int[] arr, int size) {
        if (!(arr[size - 1] == 9)) {
            arr[size - 1]++;
        } else {
            if (size == 1) {
                arr = addNewSizeArray(arr);
            }
            arr[size - 1] = 0;
            if (!(size == 1)) {
                size--;
            }
            addOneToArray(arr, size);
        }
        return arr;
    }

    public static int[] addNewSizeArray(int[] arr) {
        int[] result = new int[arr.length + 1];
        System.arraycopy(arr, 0, result, 0, arr.length);
        return result;
    }
}
