import java.util.*;

public class IndeanCoins {

    public static void valueOfCoins(Integer coins[], int amount){
        Arrays.sort(coins, Comparator.reverseOrder());

        ArrayList ans = new ArrayList<>();

        int count = 0;
        for (int i = 0; i < coins.length; i++) {
            while(coins[i] <= amount){
                count++;
                ans.add(coins[i]);
                amount -= coins[i];
            }
        }

        System.out.println("min coins used: " + count);
        System.out.println("amount of coins: " + ans);
    }
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};
        int amount = 2898;
        valueOfCoins(coins, amount);
    }
}
