import java.util.*;

public class majorityElement {

    public static HashMap majorEle(int arr[]){
        HashMap<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(result.containsKey(arr[i])){
                int val = result.get(arr[i]);
                result.put(arr[i], val+1);
            } else {
                result.put(arr[i], 1);
            }
        }
        return result; 
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,1,3,1,5,1};
        System.out.println(majorEle(nums));
    }
}
