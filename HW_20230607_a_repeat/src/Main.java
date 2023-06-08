public class Main {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("-".repeat(25) + " Task 1 " + "-".repeat(25));
        taskOne(n);  // сложность алгоритма O(n²)

        System.out.println("-".repeat(25) + " Task 2 " + "-".repeat(25));
        taskTwo(n);  // сложность алгоритма O(n²)

        System.out.println("-".repeat(25) + " Task 3 " + "-".repeat(25));
        taskThree(n);  // сложность алгоритма O(n²)

        System.out.println("-".repeat(25) + " Task 4 " + "-".repeat(25));
        taskFour(n);   // сложность алгоритма O(n)
    }

    public static void taskOne(int n) {
        if (n == 1) {
            System.out.println(n);
        }
        for (int i = 1; i <= n; i++) {   // n
            for (int j = 1; j <= n; j++) {  // n
                System.out.println("*");  // O(n²)
            }
        }
    }

    public static void taskTwo(int n) {
        int a = 0;
        for (int i = n / 2; i <= n; i++) {     // 1 - 2 4 - n/2
            for (int j = 4; j <= n; j *= 2) { // 2 - 6 8 - n/2
                a += n / 2;                   // 3 - 10 12 - n/2
            }                                 // S = (n-1)n / 2 = n²
        }
        System.out.println(a);
    }

    public static void taskThree(int n) {
        int a = 0;
        for (int i = 0; i < n; i++) {   // 1 - 4 7 9 10 - n
            for (int j = n; j > i; j--) {  // 2 - 15 19 22 - n - 1
                a += i + j;             // 3 - 28 33 - (n - 2)
                System.out.println(a);  // 4 - 40 - (n - 3)
            }                           // S = n + (n-1) + (n-2) ... 1 = n²
        }
    }

    public static void taskFour(int n) {
        int a = 0;
        int i = n;
        while (i > 0) {  // 1 - 4 6 7 - n - 1
            a += i;      // S = n - 1 = n
            i /= 2;
        }
        System.out.println(a);
    }
}