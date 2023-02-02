public class Occurrences {

    public static void printOccurrences(int key, int arr[], int i){
        if(i == arr.length){
            return;
        }
        if(arr[i] == key){
            System.out.print(i);
        }
        printOccurrences(key, arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        printOccurrences(key, arr, 0);
        System.out.println();
    }
}