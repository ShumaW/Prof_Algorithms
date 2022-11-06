public class Main {
    public static void main(String[] args) {

        // Вычислить сложность в лучшем и худшем случае

        System.out.println("-------- Доп 1 --------");
        int a = 1;
        int b = 2;
        int counter1 = 0;

        while (a != b) {
            if (a > b) {
                a = a - b;
                counter1++;
                System.out.println(counter1);
            } else {
                b = b - a;
                counter1++;
                System.out.println(counter1);
            }
        }
        System.out.println(counter1);

        // Ответ на доп.1:
        // Лучший случай - в случае когда а = b, метод
        // отработает 0 итераций. Если a - b = 1 или b - a = 1 метод отработает 1 итерацию
        // Худший случай - в случае когда одно из чисел будет
        // отрицательным или будет равно 0, метод будет работать бесконечно O(n!).

        System.out.println("-------- Доп 2 --------");

        // Доп.2

        int n1 = 2;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;

        for (int i = 0; i < n1 / 2; i++) {
            counter2++;
            for (int j = 1; j + n1 / 2 <= n1; j++) {
                counter3++;
                for (int k = 1; k <= n1; k = k * 2) {
                    counter4++;
                    System.out.println("I am expert!");

                }
            }
        }
        System.out.println(counter2);
        System.out.println(counter3);
        System.out.println(counter4);


        // Ответ на доп.2:
        // Лучший случай - если n будет равно от минус бесконечности до 1,
        // метод отработает 0 итераций. При n=2 метод отработает 2 итерации О(2).
        // Худший случай - метод отработает O(n^3) итераций.

        System.out.println("-------- Доп 3 --------");

        int counter5 = 0;
        int counter6 = 0;

        int n2 = 7;

        for (int i = 1; i <= n2; i++) {
            counter5++;
            for (int j = 1; j <= n2; j = j + i) {
                counter6++;
                System.out.println("I am expert!");

            }
        }
        System.out.println(counter5);
        System.out.println(counter6);
        // Ответ на доп.3
        // Лучший случай - если n будет равно от минус бесконечности до 1,
        // метод отработает 0 итераций. При n=1 метод отработает один раз (О(1)).
        // Худший случай - метод отработает О(n^2) итераций





    }




}