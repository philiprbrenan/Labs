package Lab4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размерность матрицы (строки х столбцы): ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] matrix = new int[cols][rows];

        System.out.println("Введите элементы массива через пробел: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[j][i] = scanner.nextInt();
            }
        }

        System.out.println("Исходная матрица: ");
        printMatrix(matrix);

        int[][] newMatrix = filterColumns(matrix, rows);

        System.out.println("Матрица после удаления столбцов с положительными элементами: ");
        printMatrix(newMatrix);
    }

    private static void printMatrix(int[][] matrix) {
        int cols = matrix.length;
        int rows = matrix[0].length;
        if (cols == 0) {
            System.out.println("Матрица пуста.");
            return;
        }
        for (int i = 0; i < rows; i++) {
            for (int[] ints : matrix) {
                System.out.print(ints[i] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isPositiveColumn(int[][] matrix, int col, int rows) {
        for (int i = 0; i < rows; i++) {
            if (matrix[col][i] <= 0) {
                return false;
            }
        }
        return true;
    }

    private static int[][] filterColumns(int[][] matrix, int rows) {
        int cols = matrix.length;
        boolean[] keepColumn = new boolean[cols];
        int newCols = 0;

        for (int j = 0; j < cols; j++) {
            if (!isPositiveColumn(matrix, j, rows)) {
                keepColumn[j] = true;
                newCols++;
            }
        }

        if (newCols == 0) {
            return new int[0][0];
        }

        int[][] newMatrix = new int[newCols][rows];
        for (int j = 0, newCol = 0; j < cols; j++) {
            if (keepColumn[j]) {
                newMatrix[newCol++] = matrix[j];
            }
        }
        return newMatrix;
    }
}