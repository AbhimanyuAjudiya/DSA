import java.util.PriorityQueue;

public class weakestRow {
    static class Row implements Comparable<Row>{
        int soldires;
        int idx;

        Row(int soldires, int idx){
            this.soldires = soldires;
            this.idx = idx;
        }

        @Override
        public int compareTo(Row r2){
            if(this.soldires == r2.soldires){
                return this.idx - r2.idx;
            } else {
                return this.soldires - r2.soldires;
            }
        }
    }
    public static void main(String[] args) {
        int army[][] = {
            {1,0,0,0},
            {1,1,1,1},
            {1,0,0,0},
            {1,0,0,0}
        };
        int k =2;

        PriorityQueue<Row> pq = new PriorityQueue<>();

        for (int i = 0; i < army.length; i++) {
            int count = 0;
            for (int j = 0; j < army[0].length; j++) {
                count += army[i][j] == 1 ? 1 : 0;
            }
            pq.add(new Row(count, i));
        }

        for (int j = 0; j < k; j++) {
            System.out.println("Row " + pq.remove().idx);
        }
    }
}
