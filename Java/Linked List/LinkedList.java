import java.nio.ShortBuffer;

import javax.swing.text.html.MinimalHTMLWriter;

public class LinkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node head;
    public static Node tail;
    public static int size;


    //--------------------- Add --------------------------
    public void addFirst(int data){ // O(1)
        // Step 1 : Create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        // Step 2 : newNode next = head
        newNode.next = head; //link

        // Step 3 : head = newNode
        head = newNode;
    }

    public void addLast(int data){ // O(1)
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addAt(int idx, int data){// O(n)
        if(idx == 0) {
            addFirst(data);
            return;
        }    
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    //-------------------------------- Print ---------------------------
    public static void print(){// O(n)
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //------------------------------ Remove ------------------------------

    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for(int i = 0; i < size - 1; i++){
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;

        return val;
    }

    public int itrSearch(int key){ // O(n)
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            } 
            temp = temp.next;
            i++;
        }
        System.out.println(key + " not found");
        return -1;
    }

    public int helper(Node head, int key){ //O(n)
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }

    public int resSearch(int key){
        return helper(head, key);
    }

    public void reverse(){ //O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public void removeNThFromEnd(int n){
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(n == sz){
            head = head.next;
            return;
        }

        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.addAt(2, 9);

        ll.print();
        ll.removeNThFromEnd(3);
        ll.print();
        // System.out.println(ll.resSearch(4));
        // System.out.println(ll.resSearch(19));
        // System.out.println(ll.size);
        
        // ll.removeFirst();
        // ll.print();
        // System.out.println(ll.size);
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);
        
    }
}
