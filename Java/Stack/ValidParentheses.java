import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        boolean valid = true;
        if(s.length() % 2 == 0){
            for(int i =0; i < s.length() ; i++){
                char temp = s.charAt(i);
                if(temp == '(' || temp == '[' || temp == '{'){
                    stack.push(temp);
                }
                else{
                    if(stack.size() == 0){
                        return false;
                    }
                    else{
                        char open = stack.peek();
                        if(temp == ')' && open == '('){
                            stack.pop();
                        }
                        else if(temp == ']' && open == '['){
                            stack.pop();
                        }
                        else if(temp == '}' && open == '{'){
                            stack.pop();
                        }
                        else{
                           return false; 
                        }
                        
                    }
                }
            }
            if(stack.size() != 0){
                return false;
            }
        }
        else{
            return false;
        }
        return valid;
    }
    public static void main(String[] args) {
        String str = "{}{}{}{{}()()((()))";
        System.out.println(isValid(str));
    }
}
