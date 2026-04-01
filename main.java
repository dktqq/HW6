import java.util.Random;

public class main {
    public static final int SIZE = 8;

    public static void main(String[] args) {
        int[][] colors = new int[SIZE][SIZE];
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
        System.out.println("Исходная матрица:");
        printMatrix(colors);
        int[][] rotated = rotateMatrix(colors);
        System.out.println("\nМатрица после поворота на 90° по часовой стрелке:");
        printMatrix(rotated);
    }
    public static int[][] rotateMatrix(int[][] matrix) {
        int[][] result = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                result[j][SIZE - 1 - i] = matrix[i][j];
            }
        }

        return result;
    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}