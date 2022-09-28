
//Time Complexity = O(nlogn)
//Space Complexity = O(n)

public class mergeSort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void merge_sort(int arr[], int si, int ei) {
        if(si >= ei){
            return;
        }
        int mid = (si + ei)/2;
        merge_sort(arr, si, mid);// left part
        merge_sort(arr, mid+1, ei);// right part

        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei-si+1];
        int i = si; // iterator for left part
        int j = mid+1; //iterator for right part
        int k = 0; //itrator for temp[]

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i <= mid){  //for remaining part of arr on left side
            temp[k++] = arr[i++];
        }
        while(j <= ei){  //for remaining part of arr on right side
            temp[k++] = arr[j++];
        }

        for(k=0,i=si; k<temp.length; k++,i++){  //copy temp[] values in orignal arr[]
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8,-2,7,5,3};
        merge_sort(arr, 0, arr.length-1);
        printArr(arr);
    }
    
}