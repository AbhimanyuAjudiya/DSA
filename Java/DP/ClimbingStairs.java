import java.util.Arrays;

public class ClimbingStairs {

    // public static int ways(int n){ //Recursion
    //     if(n == 0) return 1;
    //     if(n < 0) return 0;

    //     return ways(n-1) + ways(n-2);
    // }

    public static int ways(int n, int[] ways){ //Memoization
        if(n == 0) return 1;
        if(n < 0) return 0;

        if(ways[n] != -1){
            return ways[n];
        }
        ways[n] = ways(n-1) + ways(n-2);
        return ways[n];
    }

    public static int ways(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        for (int i = 1; i < dp.length; i++) {
            if(i == 1){
                dp[i] = dp[i-1];
            } else {
                dp[i] = dp[i-1] + dp[i-2];
            }
        }

        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int[] ways = new int[n+1];
        Arrays.fill(ways, -1);
        ways(n, ways);
        System.out.println(ways(n));
        System.out.println(ways(n,ways));
    }
}
