import java.util.Random;

public class Main {

    static long count1 = 0;
    static long count2 = 0;

    public static void main(String[] args) {

        System.out.println("-------------quickSort arr[1_000]---------------");

        long time1 = System.nanoTime();
        quickSort(getArray(1_000), 0, getArray(1_000).length - 1);
        System.out.println((System.nanoTime() - time1) + " ms.");
        System.out.println(count1);

        System.out.println("--------------bubbleSort arr[1_000]--------------");

        bubbleSort(getArray(1_000));
        System.out.println(count2);

        System.out.println("-------------quickSort arr[10_000]---------------");

        long time2 = System.nanoTime();
        quickSort(getArray(10_000), 0, getArray(10_000).length - 1);
        System.out.println((System.nanoTime() - time2) + " ms.");
        System.out.println(count1);

        System.out.println("---------------bubbleSort arr[10_000]-------------");

        bubbleSort(getArray(10_000));
        System.out.println(count2);

        System.out.println("-------------quickSort arr[1_000_000]---------------");
        long time3 = System.nanoTime();
        quickSort(getArray(1_000_000), 0, getArray(1_000_000).length - 1);
        System.out.println((System.nanoTime() - time3) + " ms.");
        System.out.println(count1);

        System.out.println("---------------bubbleSort arr[100_000]-------------");  // Специально уменьшил до 100_000. Мой компьютер виснет, если 1_000_000 элементов в массиве на bubble сортировке.

        bubbleSort(getArray(100_000));
        System.out.println(count2);

    }

    public static int[] getArray(int size) {
        Random r = new Random();
        int[] arr2 = new int[size];
        for (int i = 0; i < size; i++) {
            arr2[i] = r.nextInt();
        }
        return arr2;
    }

    private static void quickSort(int[] arr, int low, int high) {

        if (low < high) {
            int pivotIndex = findPivotIndex(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int findPivotIndex(int[] arr, int low, int high) {
        int pivot = arr[high];

        int pivotIndex = low - 1;

        for (int i = low; i < high; i++) {
            if (arr[i] <= pivot) {
                pivotIndex++;
                int tmp = arr[pivotIndex];
                arr[pivotIndex] = arr[i];
                arr[i] = tmp;
                count1++;
            }
        }
        int tmp = arr[pivotIndex + 1];
        arr[pivotIndex + 1] = arr[high];
        arr[high] = tmp;
        return pivotIndex + 1;
    }

    static void bubbleSort(int[] arr) {
        long time = System.nanoTime();
        // Написать условия циклов
        // Выполнить сравнение каждого элемента с каждым
        // Если текущий элемент больше следующего, поменять их местами

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    count2++;
                }
                // swap elements if first > second
            }
        }
        System.out.println((System.nanoTime() - time) + " ms.");
    }
}
