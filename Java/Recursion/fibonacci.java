public class fibonacci {
    public static int fib(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        int fib1 = fib(n-1);
        int fib2 = fib(n-2);
        int result = fib1 + fib2;
        return result;
    }
    public static void main(String[] args) {
        System.out.println(fib(10));
    }
}
