public class nQueensInNRows {

    public static void nQueens(char board[][], int row){
        //base case
        if(row == board.length){
            printBoard(board);
            return;
        }
        //col loop 
        for (int col = 0; col < board.length; col++) {
            board[row][col] = 'Q';
            nQueens(board, row+1);// fun call
            board[row][col] = 'X';// backtracking
        }
    }

    public static void printBoard(char board[][]) {
        System.out.println("------------ chess board -----------");
        for (int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 2;
        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++){
                board[i][j] = 'X';
            }
        }

        nQueens(board, 0);
    }
}
