import java.util.Stack;

public class StackImple {

    //using pop O(n) method
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        public static void add(int data){
            s1.push(data);
        }

        public static int remove(){
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            
            int front = s2.peek();
            s2.pop();

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
        }

    }

    //using push O(n) method
    // static class Queue{
    //     static Stack<Integer> s1 = new Stack<>();
    //     static Stack<Integer> s2 = new Stack<>();

    //     public static boolean isEmpty(){
    //         return s1.isEmpty();
    //     }

    //     public static void add(int data){
    //         while(!s1.isEmpty()) {
    //             s2.push(s1.pop());
    //         }

    //         s1.push(data);

    //         while(!s2.isEmpty()){
    //             s1.push(s2.pop());
    //         }
    //     }

    //     public static int remove(){
    //         if(isEmpty()){
    //             System.out.println("Queue is empty");
    //             return -1;
    //         }
    //         return s1.pop();
    //     }

    //     public static int peek(){
    //         if(isEmpty()){
    //             System.out.println("Queue is empty");
    //             return -1;
    //         }
    //         return s1.peek();
    //     }

    // }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
