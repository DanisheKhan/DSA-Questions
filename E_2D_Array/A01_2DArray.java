public class A01_2DArray {
    public static void main(String[] args) {
        // ==========================================
        // 1. DECLARATION & MEMORY ALLOCATION
        // ==========================================
        // Creates a 2x3 matrix filled with default values (0 for int)
        // Rows = 2, Columns = 3
        int[][] marks = new int[2][3];
        marks[0][0] = 85;
        marks[0][1] = 90;
        marks[0][2] = 78;
        marks[1][0] = 88;
        marks[1][1] = 92;
        marks[1][2] = 95;

        // ==========================================
        // 2. DIRECT INITIALIZATION (Matrix Literal)
        // ==========================================
        int[][] matrix = {
            { 13,   25,  35 }, // Row 0 -> index 0
            { 18,   65,  53 }, // Row 1 -> index 1
            { 42,   23,  66 }  // Row 2 -> index 2
        };

        // ==========================================
        // 3. ACCESSING & UPDATING ELEMENTS
        // ==========================================
        // Access element at Row index 1, Column index 2 (value: 53)
        System.out.println("Element at [1][2]: " + matrix[1][2]);

        // Update element at Row index 0, Column index 1
        matrix[0][1] = 99;
        System.out.println("Updated element at [0][1]: " + matrix[0][1]);
        System.out.println();

        // ==========================================
        // 4. DIMENSIONS (Rows & Columns)
        // ==========================================
        int totalRows = matrix.length;             // 3 rows
        int totalCols = matrix[0].length;          // 3 columns in row 0
        System.out.println("Dimensions: " + totalRows + " rows x " + totalCols + " columns");
        System.out.println();

        // ==========================================
        // 5. TRAVERSAL: STANDARD NESTED FOR-LOOP
        // ==========================================
        System.out.println("--- Matrix Traversal (Standard For Loop) ---");
        for (int i = 0; i < matrix.length; i++) {              // Iterate through each row
            for (int j = 0; j < matrix[i].length; j++) {       // Iterate through each column in row i
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println(); // Move to the next line after finishing a row
        }
        System.out.println();

        // ==========================================
        // 6. TRAVERSAL: ENHANCED FOR-EACH LOOP
        // ==========================================
        System.out.println("--- Matrix Traversal (For-Each Loop) ---");
        for (int[] row : matrix) {             // 'row' is a 1D array
            for (int element : row) {          // 'element' is an integer in that row
                System.out.print(element + "\t");
            }
            System.out.println();
        }
        System.out.println();

        // ==========================================
        // 7. JAGGED ARRAY (Rows with variable lengths)
        // ==========================================
        System.out.println("--- Jagged Array Example ---");
        int[][] jagged = {
            { 1, 2 },
            { 3, 4, 5, 6 },
            { 7 }
        };

        for (int i = 0; i < jagged.length; i++) {
            System.out.print("Row " + i + " (len " + jagged[i].length + "): ");
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
}