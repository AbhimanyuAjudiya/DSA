import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * TSHSLHS
 */
public class TSHSLHS {

    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("D");
        ts.add("B");
        ts.add("C");
        ts.add("A");
        System.out.println(ts);

        HashSet<String> hs = new HashSet<>();
        hs.add("D");
        hs.add("B");
        hs.add("C");
        hs.add("A");
        hs.add("N");
        hs.add("Z");
        hs.add("X");
        System.out.println(hs);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("D");
        lhs.add("B");
        lhs.add("C");
        lhs.add("A");
        System.out.println(lhs);
    }
}