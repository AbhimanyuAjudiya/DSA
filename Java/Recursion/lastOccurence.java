public class lastOccurence {
    public static int lastOccurence(int arr[], int key, int i) {
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,232,123,12,24,3,34,2,3,2,124,5,41,2,123,412,3};
        System.out.println(lastOccurence(arr, 3, 0));
    }
}
