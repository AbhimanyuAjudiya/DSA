import java.util.*;

// Prerequisite - Sorted array
// Time complexity is O(logn)
public class binarySearch {

    public static int sear(int arr[], int key) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start+end) / 2;
            if(arr[mid] == key){ //found
                return mid;
            }
            if(arr[mid] < key){ // right
                start = mid +1;
            } else { // left
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {112,32,12,432,123,121,64,233,92,394,234};
        int key = 394;
        System.out.println(sear(arr, key));
    }
}
