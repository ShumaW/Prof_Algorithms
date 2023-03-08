package PingPong;

import java.util.Random;

public class PingPong {

    public static void main(String[] args) {

        pingPong(20, 13);

    }

    public static int[][] pingPong(int num1, int num2) {
        int[][] arr = new int[num1][num2];
        int counter = 1;
        int startRow = 0;
        int startCol = 0;
        int endRow = num1 - 1;
        int endCol = num2 - 1;

        Random random = new Random();
        int a = random.nextInt(num1);
        int b = random.nextInt(num2);
        while (counter <= (num1 * num2)) {

                while (a >= startRow && a <= endRow && b >= startCol && b <= endCol && arr[a][b] == 0) {
                    arr[a][b] = counter;
                    counter++;
                    a--;
                    b++;
                }
                a++;
                b--;



            if (a != startRow && b == endCol) {
                a--;
                b--;
                while (a >= startRow && a <= endRow && b >= startCol && b <= endCol  && arr[a][b] == 0) {
                    arr[a][b] = counter;
                    counter++;
                    a--;
                    b--;
                }
                a++;
                b++;
            }
            if (a == startRow && b != endCol) {
                a++;
                b--;
                while (a >= startRow && a <= endRow && b >= startCol && b <= endCol  && arr[a][b] == 0) {
                    arr[a][b] = counter;
                    counter++;
                    a++;
                    b--;
                }
                a--;
                b++;
            }
            if (a != endRow && b == startCol) {
                a++;
                b++;
                while (a >= startRow && a <= endRow && b >= startCol && b <= endCol  && arr[a][b] == 0) {
                    arr[a][b] = counter;
                    counter++;
                    a++;
                    b++;
                }
            }
            a--;
            b--;

            if (a == endRow && b != endCol) {
                a--;
                b++;
                while (a >= startRow && a <= endRow && b >= startCol && b <= endCol  && arr[a][b] == 0) {
                    arr[a][b] = counter;
                    counter++;
                    a--;
                    b++;
                }
            }
            a = random.nextInt(num1);
            b = random.nextInt(num2);
        }


        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                if (arr[i][j] < 10) {
                    System.out.print(arr[i][j] + "   ");
                } else if (arr[i][j] < 100) {
                    System.out.print(arr[i][j] + "  ");
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println("");
        }

        return arr;
    }
}
