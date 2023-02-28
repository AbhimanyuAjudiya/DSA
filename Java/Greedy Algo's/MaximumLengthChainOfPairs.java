import java.util.*;

public class MaximumLengthChainOfPairs {
    public static int maxPair(int pairs[][]){
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
        int chainLen = 1;
        int lastPairEnd = pairs[0][1];

        for (int i = 0; i < pairs.length; i++) {
            if(pairs[i][0] > lastPairEnd){
                chainLen++;
                lastPairEnd = pairs[i][1];
            }
        }

        return chainLen;
    }
    public static void main(String[] args) {
        int pairs[][] = {{5,24}, {39,60}, {5, 28}, {27,40}, {50,90}};
        System.out.println(maxPair(pairs));
    }
}
