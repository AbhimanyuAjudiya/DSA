public class everyOccurence {

    public static void allOccurences(int arr[],int key,int i) {
        if(i==arr.length) {
            return;
        }
        
        if(arr[i] ==key) {
            System.out.print(i+" ");
        }
        allOccurences(arr,key,i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,0,1,1,1,1};
        int key = 1;
        allOccurences(arr, key, 0);
    }

}