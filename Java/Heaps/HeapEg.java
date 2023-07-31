import java.util.ArrayList;

public class HeapEg {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            arr.add(data);

            int childIndex = arr.size()-1;
            int parentIndex = (childIndex - 1) / 2;

            while (arr.get(childIndex) < arr.get(parentIndex)) {
                int temp = arr.get(childIndex);
                arr.set(childIndex, arr.get(parentIndex));
                arr.set(parentIndex, temp);

                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            }
        }

        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i){
            int left = 2*i + 1;
            int right = 2*i + 2;
            int minIdx = i;

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)){
                minIdx = left;
            }

            if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
                minIdx = right;
            }

            if(minIdx != i){
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public int remove(){
            int data = arr.get(0);

            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            heapify(0);
            return data;
        }

        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }

    public static void heapify(int[] arr,int i,int size){
        int left = 2*i+1;
        int right = 2*i+2;
        int maxIdx = i;
        if(left < size && arr[left] > arr[maxIdx]){
            maxIdx = left;
        }
        if(right < size && arr[right] > arr[maxIdx]){
            maxIdx = right;
        }

        if(maxIdx != i){
            int t = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = t;
        }
    }

    public static void heapSort(int[] arr){
        //step1 - build maxHeap
        int n = arr.length;
        for (int i = n/2; i >= 0; i--) {
            heapify(arr, i, n);
        }

        //step2 - push largest value at end
        for(int i = n-1; i > 0; i--){
            //swap 
            int t = arr[0];
            arr[0] = arr[i];
            arr[i] = t;

            heapify(arr, 0, i);
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,3,2,1,10};
        heapSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
