import java.util.HashSet;

public class distinctElements {
    public static void main(String[] args) {
        int arr[] = {1,5,2,5,5,1,2,2,9,7,3,2,3};
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        System.out.println(hs);
        System.out.println("size is " + hs.size());
    }
}
