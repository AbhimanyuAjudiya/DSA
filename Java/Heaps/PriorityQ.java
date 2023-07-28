import java.util.Comparator;
import java.util.PriorityQueue;

 class Students3 implements Comparable<Students3>{
    String name;
    int rank;

    Students3(String name, int rank){
        this.name = name;
        this.rank = rank;
    }

    @Override 
    public int compareTo(Students3 s2){
        return this.rank - s2.rank;
    }

}
public class PriorityQ {
    public static void main(String[] args) {
        // e -> 1
        // c -> 4
        // b -> 5
        // a -> 8
        // d -> 10
        PriorityQueue<Students3> pq = new PriorityQueue<>(Comparator.reverseOrder());
        // d -> 10
        // a -> 8
        // b -> 5
        // c -> 4
        // e -> 1

        pq.add(new Students3("a", 8));
        pq.add(new Students3("b", 5));
        pq.add(new Students3("c", 4));
        pq.add(new Students3("d", 10));
        pq.add(new Students3("e", 1));

        while(!pq.isEmpty()) {
            System.out.println(pq.peek().name+" -> "+pq.peek().rank);
            pq.remove();
        }
    }
}