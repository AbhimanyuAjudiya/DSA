import java.util.*;
public class largestNum {

    public static int max(int arr[]) {
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxNum){
                maxNum = arr[i];
            }
            if (arr[i] < minNum) {
                minNum = arr[i];
            }
        }
        System.out.println("Smallest number is :" + minNum);
        return maxNum;
    }
    public static void main(String[] args) {
        int arr[] = {112,32,12,432,123,121,64,233,92,394,234};
        System.out.println("Largest number is: " + max(arr));
    }
}
