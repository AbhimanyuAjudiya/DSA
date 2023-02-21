import java.util.Deque;
import java.util.LinkedList;

public class StackAndQueueUsingDeque {
    static class Stack{
        static Deque<Integer> d = new LinkedList<>();

        public static boolean isEmpty(){
            return d.isEmpty();
        }

        public static void push(int data){
            d.addLast(data);
        }

        public static int pop(){
            if(d.isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int front = d.getLast();
            d.removeLast();
            return front;
        }

        public static int peek(){
            if(d.isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return d.getLast();
        }

    }
    static class Queue{
        static Deque<Integer> d = new LinkedList<>();

        public static boolean isEmpty(){
            return d.isEmpty();
        }

        public static void add(int data){
            d.addLast(data);
        }

        public static int remove(){
            if(d.isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = d.getFirst();
            d.removeFirst();
            return front;
        }

        public static int peek(){
            if(d.isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return d.getFirst();
        }

    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.print(s.pop());
        }
        System.out.println();
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.print(q.remove());
        }
        System.out.println();
    }
}
