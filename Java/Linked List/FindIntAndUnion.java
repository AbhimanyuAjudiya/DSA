import java.util.HashSet;

public class FindIntAndUnion {

    public static int intersectionm(int arr1[], int arr2[]){
        HashSet<Integer> hs = new HashSet<>();
        int res = 0;
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }
        for(int i = 0; i < arr2.length; i++){
            if(hs.contains(arr2[i])){
                res++;
                hs.remove(arr2[i]);
            }
        }
        return res;
    }

    public static int union(int arr1[], int arr2[]){
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            hs.add(arr2[i]);
        }
        return hs.size();
    }
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        System.out.println(intersectionm(arr1, arr2)); 
        System.out.println(union(arr1, arr2));
    }
}
