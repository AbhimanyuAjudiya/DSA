import java.util.*;;

public class PushAtBottom {

    public static void pushAtBottom(Stack<Integer> s, int data){ 
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop(); // recurtion
        pushAtBottom(s, data);
        s.push(top);// iteration
    }
    public static void main(String[] args) {
        Stack s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
        pushAtBottom(s, 4);
        
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
