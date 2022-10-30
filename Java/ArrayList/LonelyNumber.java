import java.util.*;

public class LonelyNumber {

    public static ArrayList<Integer> findLonely(ArrayList<Integer> nums) {
        Collections.sort(nums);//5 6 8 10
        ArrayList<Integer> list = new ArrayList<>(); // list []
        for (int i=1; i < nums.size()-1; i++) {
            if (nums.get(i-1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i+1))
                list.add(nums.get(i));
        } 
        if (nums.size() == 1) {
            list.add(nums.get(0));
        }
        if (nums.size() > 1) {
            if (nums.get(0) + 1 < nums.get(1)) {
                list.add(nums.get(0));
            }
            if (nums.get(nums.size()-2) + 1 < nums.get(nums.size()-1)) {
                list.add(nums.get(nums.size()-1));
            }
        }
            return list;
    }
    public static void main(String[] args) {
        ArrayList nums = new ArrayList<>();
        nums.add(10);
        nums.add(6);
        nums.add(57);
        nums.add(85);
        nums.add(8);
        nums.add(12);
        nums.add(98);
        nums.add(90);
        nums.add(3);
        nums.add(001);
        System.out.println(findLonely(nums));
    }
}
