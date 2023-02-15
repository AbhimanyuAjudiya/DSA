public class ArrImple {
    static class Queue{
        static int[] arr;
        static int size;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        //add O(1)
        public static void add(int data){
            if(rear == size-1){
                System.out.println("queue is full");
                return;
            }
            arr[++rear] = data;
        }

        //remove O(n)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int frount = arr[0];
            for(int i = 0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return frount;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(10);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
