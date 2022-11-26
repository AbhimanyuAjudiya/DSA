import java.util.*;

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
        // String str = "{}{}{}{{}()()((()))";
        char[] arr1 = {'a', 'b', 'c'};
        char[] arr2 = {'b', 'a', 'c'};
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        Arrays.sort(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        // if(arr1 == arr2){
        //     System.out.println(true);
        // } else {
        //     System.out.println(false);
        // }
        // System.out.println(isValid(str));
    }
}
