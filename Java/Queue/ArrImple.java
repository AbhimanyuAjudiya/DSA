import javax.swing.text.html.FormSubmitEvent;

// Simple Queue
// public class ArrImple {
//     static class Queue{
//         static int[] arr;
//         static int size;
//         static int rear;

//         Queue(int n){
//             arr = new int[n];
//             size = n;
//             rear = -1;
//         }

//         public static boolean isEmpty(){
//             return rear == -1;
//         }

//         //add O(1)
//         public static void add(int data){
//             if(rear == size-1){
//                 System.out.println("queue is full");
//                 return;
//             }
//             arr[++rear] = data;
//         }

//         //remove O(n)
//         public static int remove(){
//             if(isEmpty()){
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//             int frount = arr[0];
//             for(int i = 0; i<rear; i++){
//                 arr[i] = arr[i+1];
//             }
//             rear--;
//             return frount;
//         }

//         //peek
//         public static int peek(){
//             if(isEmpty()){
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//             return arr[0];
//         }
//     }
//     public static void main(String[] args) {
//         Queue q = new Queue(10);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         while(!q.isEmpty()){
//             System.out.println(q.remove());
//         }
//     }
// }

//Circuler Queue
public class ArrImple {
    static class Queue{
        static int[] arr;
        static int size;
        static int rear;
        static int front;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear + 1) % size == front;
        }

        //add O(1)
        public static void add(int data){
            if(isFull()){
                System.out.println("queue is full");
                return;
            }
            
            // if we are adding 1st element
            if(front == -1){
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        //remove O(n)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            //if we are removing last element
            if(rear == front){
                rear = front = -1;
            } else {
                front = (front+1) % size;
            }
            return result;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
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
