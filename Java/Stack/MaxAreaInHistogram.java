import java.util.Stack;

public class MaxAreaInHistogram {

    public static void maxAreaInHistogram(int[] arr){
        int maxArea = 0;
        int prevSmall[] = new int[arr.length];
        int nextSmall[] = new int[arr.length];

        //Next small
        Stack<Integer> s = new Stack<>();
        for(int i = arr.length -1; i >= 0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nextSmall[i] = arr.length;
            } else {
                nextSmall[i] = s.peek();
            }

            s.push(i);
        }
        //prev small
        s = new Stack<>(); 
        for(int i = 0; i < arr.length; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                prevSmall[i] = -1;
            } else {
                prevSmall[i] = s.peek();
            }
            s.push(i);
        }
        //find area
        for (int j = 0; j < arr.length; j++) {
            int height = arr[j];
            int width = nextSmall[j] - prevSmall[j] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }
        System.out.println(maxArea);
    }
    public static void main(String[] args) {
        int histogram[] = {2,1,5,6,2,3};
        maxAreaInHistogram(histogram);
    }
}
