public class subArr {

    public static void subArr(int arr[]) {  // Time complexity O(n³)
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void sumOfSubArr(int arr[]) { //brute force Time complexity O(n³)
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            // System.out.print(arr[i]);
            for (int j = i; j < arr.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                    // System.out.print(arr[k] + " ");
                }
                System.out.println(sum);
                if(sum > max){
                    max = sum;
                }
                if(sum < min){
                    min = sum;
                }
            }
        }
        System.out.println("Max sum: " + max);
        System.out.println("Min sum: " + min);
    }
    public static void maxOfSubArr(int arr[]) { //using prefix Time complexity O(n²)
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int prefix[] = new int[arr.length];

        // calculate prefix
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            // System.out.print(arr[i]);
            for (int j = i; j < arr.length; j++) {
                int end = j;
                
                sum = (start == 0) ? prefix[end] : prefix[end] - prefix[start-1];
                
                if(sum > max){
                    max = sum;
                }
                if(sum < min){
                    min = sum;
                }
            }
        }
        System.out.println("Max sum: " + max);
        System.out.println("Min sum: " + min);
    }

    public static void kadans(int arr[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int cs = 0;

        for (int i = 0; i < arr.length; i++) { //Time complexity O(n)
            cs += arr[i];
            if(cs < min){
                min = cs;
            }
            if(cs > max){
                max = cs;
            }
            // if(cs<0){
            //     cs = 0;
            // }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
    public static void main(String[] args) {
        int arr[]={-1,-2,-3,-4};
        kadans(arr);
    }
}