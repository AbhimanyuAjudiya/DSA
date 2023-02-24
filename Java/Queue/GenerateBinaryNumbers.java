import java.util.*;
import java.util.LinkedList;

public class GenerateBinaryNumbers {
    public static void binaryGenerater(int n){
        Queue<String> q = new LinkedList<String>();
        q.add("1");
        while(n-- > 0){
            String str1 = q.peek();
            q.remove();
            System.out.println(str1);
            String str2 = str1;
            q.add(str1 + "0");
            q.add(str2 + "1");
        }
    }
    public static void main(String[] args) {
        binaryGenerater(10);
    }
}
