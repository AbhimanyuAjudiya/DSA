import java.util.*;

public class linearSearch {

    public static void sear(int arr[], int n) {
        for(int i = 0; i<arr.length;i++){
            if(arr[i] == n){
                System.out.println(i);
                return;
            }
        }
        System.out.println("Element not found!");
    }
    public static void main(String[] args) {
        int n=12;
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        sear(arr, n);
    }
}