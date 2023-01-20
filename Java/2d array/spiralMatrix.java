public class spiralMatrix {

    public static void spiralM(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        while(startRow <= endRow && startCol <= endCol){
            //Top = Printing startRow
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            //Right = Printing endCol
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            //Bottom = Printing endCol
            for (int j = endCol-1; j >= startCol; j--) {
                System.out.print(matrix[endRow][j] + " ");
            }
            //Left = Printing startCol
            for (int i = endRow-1; i >= startRow+1; i--) {
                System.out.print(matrix[i][startCol] + " ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][] = {{ 1, 2, 3, 4},
                       { 5, 6, 7, 8},
                       { 9,10,11,12},
                       {13,14,15,16}};
        spiralM(matrix);
    }
}
