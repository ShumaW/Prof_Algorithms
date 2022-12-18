import java.util.Arrays;

public class Main {
    /*
    First level: На основе кода из гитхаба сравнить производительность разных
    способов вычисления n-ого члена ряда Фибоначчи.
    Добавить счетчики количества итераций
    Добавить замеры времени вызова в мс (resultTime / 1000000)
    Протестировать на входных значениях 5, 10, 25, 50 каждый из методов
    Выполнение кода с тестами может занимать 5-7 минут, это нормально, если будет больше 10,
    вряд ли есть смысл продолжать, нужно будет уменьшить вернюю границу на 5 и уменьшать
    до тех пор, пока не будет более-менее адекватное время (в пределах 5 минут на все тесты для 50)
     */
    static long[] arr = new long[50];
    static long counter = 0;
    public static void main(String[] args) {
        Arrays.fill(arr, -1);

        int n = 50;
        long start = System.currentTimeMillis();
        counter = 0;
        long result = fib(n);
        long end = System.currentTimeMillis();
        System.out.println("-".repeat(25) + " n = " + n + " " + "-".repeat(25));
        System.out.printf("fib: " + "Result = %d, count = %d, time(s) = %d.\n", result, counter, ((end - start)/1000000));

        long start1 = System.currentTimeMillis();
        counter = 0;
        long result1 = fibTab(n);
        long end1 = System.currentTimeMillis();
        System.out.printf("fibTab: " + "Result = %d, count = %d, time(s) = %d.\n", result1, counter, (end1 - start1));

        long start2 = System.currentTimeMillis();
        counter = 0;
        long result2 = fibTab(n);
        long end2 = System.currentTimeMillis();
        System.out.printf("fibMemo: " + "Result = %d, count = %d, time(s) = %d.\n", result2, counter, (end2 - start2));

        /*
        ------------------------- n = 5 -------------------------
        fib: Result = 8, count = 15, time(s) = 0.
        fibTab: Result = 8, count = 4, time(s) = 0.
        fibMemo: Result = 8, count = 4, time(s) = 0.

        ------------------------- n = 10 -------------------------
        fib: Result = 89, count = 177, time(s) = 0.
        fibTab: Result = 89, count = 9, time(s) = 0.
        fibMemo: Result = 89, count = 9, time(s) = 0.

        ------------------------- n = 25 -------------------------
        fib: Result = 121393, count = 242785, time(s) = 0.
        fibTab: Result = 121393, count = 24, time(s) = 0.
        fibMemo: Result = 121393, count = 24, time(s) = 0.

        ------------------------- n = 50 -------------------------
        fib: Result = 20365011074, count = 40730022147, time(s) = 0.
        fibTab: Result = 20365011074, count = 49, time(s) = 0.
        fibMemo: Result = 20365011074, count = 49, time(s) = 0.

         */
    }

    public static long fib(int n) {

        counter++;

        if (n < 2) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }

    public static long fibTab(int n) {
        if (n < 2) {
            return 1;
        }
        long[] arr2 = new long[n + 1];
        arr2[0] = 1;
        arr2[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr2[i] = arr2[i - 1] + arr2[i - 2];
            counter++;
        }
        return arr2[n];
    }

    public static long fibMemo(int n) {
        counter++;

        if (arr[n] != -1) {
            return arr[n];
        }

        if (n < 2) {
            return 1;
        }

        arr[n] = fibMemo(n - 1) + fibMemo(n - 2);
        return arr[n];
    }
}