import java.util.*;

public class validAnagrams {

    public static boolean validAnagram(String s, String t){
        HashMap<Character, Integer> comp = new HashMap<>();

        if(s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            comp.put(s.charAt(i), comp.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int j = 0; j < s.length(); j++) {
            if(comp.get(t.charAt(j)) != null){
                if(comp.get(t.charAt(j)) == 1){
                    comp.remove(t.charAt(j));
                } else {
                    comp.put(t.charAt(j), comp.get(t.charAt(j)) - 1);
                }
            } else {
                return false;
            }
        }

        return comp.isEmpty();

    }
    public static void main(String[] args) {
        System.out.println(validAnagram("null", "unll"));
    }
}
