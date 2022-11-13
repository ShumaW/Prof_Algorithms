public class Main {
    public static void main(String[] args) {
        /*
        First level: Задача заключается в следующем. Имеется три стержня —
        левый, средний и правый. На левом стержне находятся n дисков,
        диаметры которых различны. Диски упорядочены по размеру диаметра,
        сверху лежит наименьший, снизу — наибольший. Требуется перенести диски
        с левого стержня на правый, используя средний стержень как вспомогательный.
        Головоломка имеет следующие два правила:
              1. Вы не можете поместить больший диск на меньший диск.
              2. За один раз можно перемещать только один диск.
        Реализуйте два подхода для решения.
        Итеративно
        Рекурсивно
         */

//        System.out.println("------------ Итеративный метод -------------");

//        hanoi1(4, 1, 2);

        System.out.println("------------ Рекурсивный метод -------------");

        hanoi2(4, 1, 3);
    }

//    public static void hanoi1(int n, int start, int end) {
//        int tmp1 = 6 - start - end;
//        if (n % 2 == 0) {
//            for (int i = 1; i < n; i++) {
//                for (int j = 0; j < n; j++) {
//                    System.out.printf("Move disk %d from pin %d to pin %d \n", i, start, tmp1);
//                    System.out.printf("Move disk %d from pin %d to pin %d \n", i + 1, start, end);
//                    System.out.printf("Move disk %d from pin %d to pin %d \n", i, tmp1, end);
//                }
//
//            }
//        } else {
//            for (int i = 0; i < n; i++) {
//                System.out.printf("Move disk %d from pin %d to pin %d \n", n -i, start, end);
//                System.out.printf("Move disk %d from pin %d to pin %d \n", n-i-1, start, tmp1);
//                System.out.printf("Move disk %d from pin %d to pin %d \n", n-i, end, tmp1);
//            }
//        }
//
//    }


    public static void hanoi2(int n, int start, int end) {
        if (n == 1) {
            System.out.printf("Move disk 1 from pin %d to pin %d \n", start, end);
//            return;
        } else {
            int tmp = 6 - start - end;
            hanoi2(n - 1, start, tmp);
            System.out.printf("Move disk %d from pin %d to pin %d \n", n, start, end);

            hanoi2(n - 1, tmp, end);
        }
    }
}