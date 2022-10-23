import java.util.ArrayList;

import javax.xml.transform.Source;

public class Operations {
    public static void main(String[] args) {

        //initialization
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        //add operation - O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        //get operation - O(1)
        // System.out.println(list.get(3)); //4

        //delete operation - O(n)
        // list.remove(3);
        // System.out.println(list); // [1, 2, 3, 5]

        //set element - O(n)
        // list.set(0,100);
        // System.out.println(list);// [100, 2, 3, 4, 5]

        //contains element - O(n)
        // System.out.println(list.contains(1)); //true
        // System.out.println(list.contains(11)); //false

        //size of arr
        // System.out.println(list.size()); // 5

        //5 4 3 2 1
        // for (int i = list.size()-1; i >=0; i--) {
        //     System.out.print(list.get(i) + " ");
        // }System.out.println();

        //return max
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size();i++){
            if(max < list.get(i)){
                max = list.get(i);
            }
        }
        System.out.println(max);
    }
}
