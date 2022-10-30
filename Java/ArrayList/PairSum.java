import java.util.ArrayList;

public class PairSum {

    // ----------------------- brute froce - O(n²) -----------------------------
    // public static boolean pairs(ArrayList<Integer> list, int tar) {
    //     for (int i = 0; i < list.size(); i++) {
    //         for (int j = i+1; j < list.size(); j++) {
    //             if(list.get(i) + list.get(j) == tar){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    //---------------------- two pointer - O(n) --------------------------------
    public static boolean pairs(ArrayList<Integer> list, int tar) {
        int lp = 0;//  Left Pointer
        int rp = list.size()-1;// Right Pointer
        while(lp < rp){
            if(list.get(lp) + list.get(rp) == tar){
                return true;
            } else if(list.get(lp) + list.get(rp) < tar){
                lp++;
            } else{
                rp--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            list.add(i);
        }
        System.out.println(pairs(list,10));
    }
}
