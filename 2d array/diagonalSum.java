public class diagonalSum {

    // public static int diagonalSum(int matrix[][]) {     //Time complexity O(n²)
    //     int sum = 0;
    //     for (int i = 0; i < matrix.length; i++) {
    //         for (int j = 0; j < matrix[0].length; j++) {
    //             if (i==j) {
    //                 sum+=matrix[i][j];
    //             } else if(i+j = matrix.length-1){
    //                 sum+=matrix[i][j];
    //             }
    //         }
    //     }
    //     return sum;
    // }

    public static int diagonalSum(int matrix[][]) {  //Time complexity O(n)
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum+=matrix[i][i]; //PD - Primary Diagonal

            if (i != matrix.length-i-1) { // by this condition the center element will not added twice
                sum+= matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{ 1, 2, 3, 4}, //PD = 1+6+11+16 = 34
                          { 5, 6, 7, 8}, //SD = 4+7+10+11 = 34 
                          { 9,10,11,12}, 
                          {13,14,15,16}};
        System.out.println(diagonalSum(matrix)); //Total = 34+34 = 68
    }
}
