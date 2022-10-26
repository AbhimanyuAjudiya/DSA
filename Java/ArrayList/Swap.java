import java.util.*;

public class Swap {
    public static void swap(ArrayList<Integer> list, int ind1, int ind2) {
        int temp = list.get(ind1);
        list.set(ind1, list.get(ind2));
        list.set(ind2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        System.out.println(list);
        int ind1 = 2, ind2 = 4;
        swap(list, ind1, ind2);
        System.out.println(list);

    }
}
