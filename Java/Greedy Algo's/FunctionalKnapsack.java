import java.util.*;

public class FunctionalKnapsack {

    
    public static int knapsack(int val[], int wieght[], int maxWeight){
        double ratio[][] = new double[val.length][2];
        // 0th col = ind
        // 1st col = ratio
        for(int i = 0; i<val.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)wieght[i];
        }

        // lambda function to sort ratio array in basis of 1st col
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = maxWeight;
        int maxVal = 0;

        for(int i = ratio.length-1; i>=0; i--){
            int idx = (int)ratio[i][0];
            if(capacity >= wieght[idx]){// including full items
                maxVal += val[idx];
                capacity -= wieght[idx];
            } else {                    // including fractional item
                maxVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        return maxVal;
    }
    public static void main(String[] args) {
        int val[] = {60, 100, 120};
        int wieght[] = {10, 20, 30};
        int maxWeight = 50;
        System.out.println(knapsack(val, wieght, maxWeight));
    }
}
