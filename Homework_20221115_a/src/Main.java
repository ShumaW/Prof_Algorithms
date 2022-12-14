import java.util.Arrays;

public class Main {
    /*
    First level:
    1. Даны два целых числа x и n, напишите функцию для вычисления x^n
     решение 1 - рекурсивно O(n)
     решение 2 - улучшить решение 1 до O(lon n)

    2. Имея два отсортированных массива размера m и n соответственно,
    вам нужно найти элемент, который будет находиться на k-й позиции в конечном отсортированном массиве.
    Массив 1 - 100 112 256 349 770
    Массив 2 - 72 86 113 119 265 445 892
    к = 7
    Вывод : 256
    Окончательный отсортированный массив -
    72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
    7-й элемент этого массива равен 256.


    3. Имея отсортированный массив arr[] и число x, напишите функцию,
    которая подсчитывает вхождения x в arr[]. Ожидаемая временная сложность O(Log n)
    arr[] = {1, 1, 2, 2, 2, 2, 3,}
    x = 2
    Вывод: 4 раза

    4. Найдите пиковый элемент в двумерном массиве
    Элемент является пиковым, если он больше или равен своим четырем соседям слева,
    справа, сверху и снизу. Например, соседями для A[i][j] являются A[i-1][j],
    A[i+1][j], A[i][j-1] и A[i][j+1 ]. Для угловых элементов отсутствующие соседи
    считаются отрицательными бесконечными значениями.
    10 20 15
    21 30 14
     7 16 32
    Выход: 30
    30 — пиковый элемент, потому что все его
    соседи меньше или равны ему.
    32 также можно выбрать в качестве пика.

    note
    1 Смежная диагональ не считается соседней.
    2 Пиковый элемент не обязательно является максимальным элементом.
    3 Таких элементов может быть несколько.
    4 Всегда есть пиковый элемент.
     */
    public static void main(String[] args) {
        System.out.println("---------- Task 1 -----------");
        int x = 2;
        int n = 5;
        // решение 1
        int result = x;
        for (int i = 1; i < n; i++) {
            result *= x;
        }
        System.out.println("Решение 1: " + result);
        // решение 2
        System.out.println("Решение 2: " + binpow(x, n));
        System.out.println("---------- Task 2 -----------");
        int[] arr1 = {100, 112, 256, 349, 770};
        int[] arr2 = {72, 86, 113, 119, 265, 445, 892};
        int k = 7;
        int[] c = new int[arr1.length + arr2.length];
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            c[i] = arr1[i];
            count++;
        }
        for (int j = 0; j < arr2.length; j++) {
            c[count++] = arr2[j];
        }
        Arrays.sort(c);
        for(int i = 0;i<c.length;i++)
            System.out.print(c[i]+" ");
        for (int i = 0; i < c.length; i++) {
            if ((k-1) == i){
                System.out.println(System.lineSeparator() + c[i]);
            }
        }
        System.out.println("---------- Task 3 -----------");
        int[] arr3 = {1, 1, 2, 2, 2, 2, 3,};
        int x1 = 2;
        int counter = 0;
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] == x1) {
                counter++;
            }
        }
        System.out.println(counter);

    }

        public static int binpow(int a, int n) {
            if (n == 0)
                return 1;
            if (n % 2 == 1)
                return binpow(a, n - 1) * a;
            else {
                int b = binpow(a, n / 2);
                return b * b;
            }
        }
    }






