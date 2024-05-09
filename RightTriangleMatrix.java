public class RightTriangleMatrix {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the matrix

        // Create and fill the matrix
        int[][] matrix = new int[rows][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                matrix[i][j] = 1; // Fill with 1 to represent the triangle
            }
        }

        // Print the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
