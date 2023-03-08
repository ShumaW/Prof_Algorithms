package ArraySpiral;

public class ArraySpiral {
    public static void main(String[] args) {

        getSquareArray(9);

    }

    public static int[][] getSquareArray(int num) {
        int[][] array = new int[num][num];
        int count = 1;
        int startRow = 0;
        int startCol = 0;
        int endRow = num - 1;
        int endCol = num - 1;

        while (count <= (num * num)) {
            for (int i = startCol; i <= endCol && count <= (num * num); i++) {
                array[startRow][i] = count;
                count++;
            }
            startRow++;

            for (int i = startRow; i <= endRow && count <= (num * num); i++) {
                array[i][endCol] = count;
                count++;
            }
            endCol--;

            for (int i = endCol; i >= startCol && count <= (num * num); i--) {
                array[endRow][i] = count;
                count++;
            }
            endRow--;

            for (int i = endRow; i >= startRow && count <= (num * num); i--) {
                array[i][startCol] = count;
                count++;
            }
            startCol++;
        }

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (array[i][j] < 10) {
                    System.out.print(array[i][j] + "   ");
                } else if (array[i][j] < 100){
                    System.out.print(array[i][j] + "  ");
                } else {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println("");
        }
        return array;
    }
}