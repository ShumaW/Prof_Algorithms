import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = {11, 10, 9, 8, 7, 6, 5};
        int[] arrSort = mergeSort(arr);
        System.out.println(Arrays.toString(arrSort));
    }
    //Task 1. Написать самостоятельно сортировку слиянием.
    //Стереть все то, что написали во время классной работы и заново написать
    // merge sort, опираясь на текстовое описание и псевдокод.

    private static int[] mergeSort(int[] arr) {
        int len = arr.length;

        if (len == 1) {
            return arr;
        }

        int mid = len / 2;
        int[] first = new int[mid];
        int[] second = new int[len - mid];

        for (int i = 0; i < mid; i++) {
            first[i] = arr[i];
        }
        for (int i = 0; i < len - mid; i++) {
            second[i] = arr[i + mid];
        }

        return merge(mergeSort(first), mergeSort(second));
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] arr = new int[len1 + len2];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < len1 && j < len2) {
            if (arr1[i] < arr2[j]) {
                arr[k++] = arr1[i++];
            } else {
                arr[k++] = arr2[j++];
            }
        }
        while (i < len1) {
            arr[k++] = arr1[i++];
        }
        while (j < len2) {
            arr[k++] = arr2[j++];
        }
        return arr;
    }
}