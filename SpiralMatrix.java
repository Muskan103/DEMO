public class SpiralMatrix {
    public static int[][] generateSpiralMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];

        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;
        int value = 1;

        while (top <= bottom && left <= right) {
            // Traverse top row
            for (int i = left; i <= right; i++) {
                matrix[top][i] = value++;
            }
            top++;

            // Traverse right column
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = value++;
            }
            right--;

            // Traverse bottom row
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = value++;
            }
            bottom--;

            // Traverse left column
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = value++;
            }
            left++;
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;
        int[][] spiralMatrix = generateSpiralMatrix(rows, cols);
        printMatrix(spiralMatrix);
    }
}
