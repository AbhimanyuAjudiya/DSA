import java.util.*;
import java.util.*;

public class QueueLLAndAD {
    public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("This is peek:" + q.peek());
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
