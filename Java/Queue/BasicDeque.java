import java.util.Deque;
import java.util.LinkedList;

public class BasicDeque {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        d.addFirst(1); // 1
        d.addFirst(2); // 2 1
        d.addLast(3);  // 2 1 3
        d.addLast(4);  // 2 1 3 4
        d.removeFirst();  // 1 3 4
        d.removeLast();   // 1 3
        d.getFirst();     // 1
        d.getLast();      // 3
    }
}
