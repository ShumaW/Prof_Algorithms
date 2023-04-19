import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        System.out.println("-".repeat(25) + " Task 1 " + "-".repeat(25));
        String str1 = "UUDD";
        System.out.println(Arrays.toString(runAway(str1)));
        String str2 = "UURR";
        System.out.println(Arrays.toString(runAway(str2)));

        System.out.println("-".repeat(25) + " Task 2 " + "-".repeat(25));
        ListNodes l1 = new ListNodes(1);
        l1.add(2);
        l1.add(7);
        ListNodes l2 = new ListNodes(3);
        l2.add(3);
        l2.add(11);

        ListNodes listNodes = mergeTwo(l1, l2);

        while (listNodes != null){
            System.out.print(listNodes.val + " ");
            listNodes = listNodes.next;
        }



    }

    /**
     * @param moves "UUDD", "LRRL"
     * @return coordinates
     */

    public static int[] runAway(String moves) {
        int upDown = 0;
        int leftRight = 0;

        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U') {
                upDown++;
            }
            if (moves.charAt(i) == 'D') {
                upDown--;
            }
            if (moves.charAt(i) == 'L') {
                leftRight++;
            }
            if (moves.charAt(i) == 'R') {
                leftRight--;
            }
        }
        int[] coordinate = {upDown, leftRight};

        return coordinate;
    }

    /**
     * 1 -> 2 -> 3
     * 4 -> 5 -> 6
     * output 1 - 2 - 3 - 4 - 5 - 6
     * <p>
     * 1 -> 2 - > 7
     * 3 -> 3 -> 11
     * output 1 - 2 - 3 - 3 - 7 - 11
     */

    public static ListNodes mergeTwo(ListNodes l1, ListNodes l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else {
            l1.next = mergeTwo(l1.next, l2);
            return l1;
        }
    }

    /**
     * int[] arr = [-1 0 -9 8 11 -3 1 5]
     * int target = X
     * <p>
     * Найти сумму трех чисел которые в сумме дадут target.
     * Если такого числа нет, то найти сумму трех чисел, сумма которых максимально
     * близка к значению target.
     */

    public int threeSum(int[] arr, int target) {
        return 0;
    }


}

