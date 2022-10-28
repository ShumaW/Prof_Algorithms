public class Main {
    public static void main(String[] args) {
        /*
        First level: 1. Linear Search
        Given an array arr[] of N elements, the challenge is to write
        a function to find a given element x in arr[] .
        Линейный поиск используется для поиска ключевого элемента
        среди нескольких элементов.
        Линейный поиск сегодня используется меньше, потому что он
        медленнее, чем бинарный поиск и хеширование.

          Алгоритм:

        Шаг 1: Обход массива
        Шаг 2: Сопоставьте ключевой элемент с элементом массива
        Шаг 3: Если ключевой элемент найден, верните позицию индекса элемента массива.
        Шаг 4: Если ключевой элемент не найден, верните -1
         */
        System.out.println("------------ Task 1 ------------------");

        int[] arr1 = {2, 7, 9, 4, 11, 8, 23, 0, 4, 6, 9};
        int x = 7;
        int res1 = -1;
        for (int i = 0; i < arr1.length; i++) {
            if (x == arr1[i]) {
                res1 = i;
            }
        }
        System.out.println(res1);

        /*
        2. Find the element that appears once in a sorted array
        Given a sorted array in which all elements occur twice
        (one after the other) and one element appears only once.

        Простое решение состоит в обходе массива слева направо.
        Поскольку массив отсортирован, мы легко можем найти нужный элемент.

            Алгоритм:

        Шаг 1: Обход массива через один элемент
        Шаг 2: Если элемент отличается от первого то мы нашли не задублированный элемент
        Шаг 3: Вернем элемент или позицию в массиве
        Шаг 4: Если ключевой элемент не найден, верните -1 или что то еще :)
        …
        Шаг 5: Исправить ошибку ArrayIndexOutOfBoundsException
        */

        System.out.println("------------ Task 2 ------------------");

        int[] arr2 = {1, 1, 2, 2, 4, 4, 5, 5,6, 7, 7, 9, 9};
        int res2 = -1;
        for (int i = 0; i < arr2.length - 1; i += 2) {
            if (arr2[arr2.length - 1] != arr2[arr2.length - 2]) {
                res2 = arr2[arr2.length - 1];
                break;
            } else if (arr2[i] != arr2[i + 1]) {
                res2 = arr2[i];
                break;
            }
        }
        System.out.println(res2);


    }
}