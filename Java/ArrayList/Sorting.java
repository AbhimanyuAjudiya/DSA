import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        
        System.out.println(list); //[5, 4, 3, 2, 1]
        Collections.sort(list);  //ascending
        System.out.println(list);//[1, 2, 3, 4, 5]

        Collections.sort(list, Collections.reverseOrder()); //descending
                              //Comparators - define func logic
        System.out.println(list);//[5, 4, 3, 2, 1]
    }
}
