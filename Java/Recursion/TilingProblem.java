public class TilingProblem {
    public static int tilingProblem(int n) {
        if(n == 0 || n == 1){ //base case
            return 1;
        }        
        // //checking for horizontal
        // int fnm1 = tilingProblem(n-1);
        // // checking for vertical
        // int fnm2 = tilingProblem(n-2);
        
        // int noOfWays = fnm1 + fnm2;
        // return noOfWays;

        return tilingProblem(n-1) + tilingProblem(n-2);
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }
}
