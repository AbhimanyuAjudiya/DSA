public class nQueens {

    public static boolean isSafe(char board[][], int row, int col){
        //check up side
        for(int i = row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //check diagonal left
        for (int i = row-1, j = col-1; i>=0 && j>=0; i--,j--) {
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //check diagonal right
        for(int i = row-1, j = col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }


        return true;
    }
    public static void nQueens(char board[][], int row){
        //base case
        if(row == board.length){
            // printBoard(board);
            count++;
            return;
        }
        //col loop 
        for (int col = 0; col < board.length; col++) {
            if(isSafe(board,row,col)){
                board[row][col] = 'Q';
                nQueens(board, row+1);// fun call
                board[row][col] = 'X';// backtracking
            }
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
    static int count = 0;
    public static void main(String[] args) {
        int n = 5;
        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++){
                board[i][j] = 'X';
            }
        }

        nQueens(board, 0);
        System.out.println("Total numbers of Solutions will be: " + count);
    }
}
