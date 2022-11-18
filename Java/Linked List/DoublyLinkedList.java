import java.net.SocketTimeoutException;

public class DoublyLinkedList {
    
    public class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            next = null;
            prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //remove
    public int removeFirst(){
        if(head == null){
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        int val = head.data;
        if(size == 1) {
            head = tail = null;
            size--;
            return val;
        }
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public int removeLast(){
        if(head == null){
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        int val = tail.data;
        if(size == 1) {
            head = tail = null;
            size--;
            return val;
        }
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }
    
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
             
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        // dll.addLast(0);
        // dll.removeFirst();
        // dll.removeLast();
        dll.print();
        dll.reverse();
        dll.print();
        System.out.println(dll.size);
    }
}
