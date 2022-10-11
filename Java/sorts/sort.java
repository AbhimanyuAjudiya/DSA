import java.util.*;
import javax.swing.LayoutStyle;;

public class sort {

    public static void bubbleSort(int arr[]) { // Time complexity O(n²)
        for (int i = 0; i < arr.length - 1; i++) { //why -1? Because we will compare value with front values
            for (int j = 0; j < arr.length-1-i; j++) { //why -1? Because we will compare value with front values
                if(arr[j] > arr[j+1]){ //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void modifiedbubbleSort(int arr[]) { // Time complexity O(n²)
        for (int i = 0; i < arr.length - 1; i++) { //why -1? Because we will compare value with front values
            boolean swapped = false;
            for (int j = 0; j < arr.length-1-i; j++) { //why -1? Because we will compare value with front values
                if(arr[j] > arr[j+1]){ //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
                break;
        }
    }

    public static void selectionSort(int arr[]) { // Time complexity O(n²)
        for (int i = 0; i < arr.length-1; i++) {
            int minPos = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos]; // swap
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int arr[]) { // Time complexity O(n²)
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            // finding correct position for element
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }

    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {  // getting largest number from unsorted array to set the length of count[] arr
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for (int i = 0; i < arr.length; i++) { // Incrementing the index of count[] by one where indexOfCount = arr[i]Element
            count[arr[i]]++;
        }

        int j = 0;
        //sort
        for (int i = 0; i < count.length; i++) {
            while(count[i] > 0){
                arr[j] = i; // inserting indexOfCount 
                j++;
                count[i]--;// decrementing at index i
            }
        }

    }
    
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,2,3};
        modifiedbubbleSort(arr);
        printArr(arr);
    }
}