package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("-".repeat(50));
        int[] arr1 = {100, 112, 256, 349, 770};
        int[] arr2 = {72, 86, 113, 119, 265, 445, 892};

        System.out.println(findElement(arr1, arr2, 7));
        System.out.println("-".repeat(50));

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        System.out.println(binarySearchRecursive(arr, 9, 0, arr.length - 1));
    }

    /**
     * Task 1. Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент,
     * который будет находиться на k-й позиции в конечном отсортированном массиве.
     * Массив 1 - 100 112 256 349 770
     * Массив 2 - 72 86 113 119 265 445 892
     * к = 7
     * Вывод : 256
     * Окончательный отсортированный массив -
     * 72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
     * 7-й элемент этого массива равен 256.
     * Массивы приведены для примера. Алгоритм должен работать и на других массивах.
     */
    public static int findElement(int[] arr1, int[] arr2, int k) {
        int[] temp = new int[arr1.length + arr2.length];
        int indArr1 = 0;
        int indArr2 = 0;
        int indexTemp = 0;

        while (indArr1 < arr1.length && indArr2 < arr2.length) {
            if (arr1[indArr1] > arr2[indArr2]) {
                temp[indexTemp] = arr2[indArr2];
                indArr2++;
                indexTemp++;
            } else {
                temp[indexTemp] = arr1[indArr1];
                indArr1++;
                indexTemp++;
            }
        }
        if (indArr1 == arr1.length) {
            while (indArr2 < arr2.length) {
                temp[indexTemp] = arr2[indArr2];
                indArr2++;
                indexTemp++;
            }
        }
        if (indArr2 == arr2.length) {
            while (indArr1 < arr1.length) {
                temp[indexTemp] = arr1[indArr1];
                indArr1++;
                indexTemp++;
            }
        }
        return temp[k - 1];
    }

    /**
     * Task 2. Реализовать рекурсивный алгоритм бинарного поиска. Используйте стратегию "разделяй и властвуй".
     */
    public static int binarySearchRecursive(int[] arr, int element, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == element) {
            return mid;
        } else if (arr[mid] > element) {
            return binarySearchRecursive(arr, element, low, mid - 1);
        } else {
            return binarySearchRecursive(arr, element, mid + 1, high);
        }
    }
}