import java.util.ArrayList;

public class MaxWater {
    public static int mostWater(ArrayList<Integer> heigth) {
        // ----------------------- brute froce - O(n²) -----------------------------
       
        // int maxWater = 0;
        // for(int i=0; i<heigth.size(); i++){
        //     for(int j=i+1; j<heigth.size(); j++){
        //         int ht = Math.min(heigth.get(i), heigth.get(j));
        //         int width = j-i;
        //         int currWater = ht*width;
        //         maxWater = Math.max(maxWater, currWater);
        //     }
        // }
        // return maxWater;

        //---------------------- two pointer - O(n) --------------------------------

        int maxWater = 0;
        int lp = 0;
        int rp = heigth.size() - 1;
        while (lp < rp) {
            int ht = Math.min(heigth.get(lp), heigth.get(rp));
            int width = rp - lp;
            int currWater = ht*width;
            if(heigth.get(lp) < heigth.get(rp)){
                lp++;
            } else {
                rp--;
            }
            maxWater = Math.max(maxWater, currWater);
        }
        return maxWater;

    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(mostWater(height));
    }
}
