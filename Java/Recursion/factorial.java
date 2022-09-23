public class factorial {
    public static int fact(int n) {
        if(n == 0){
            return 1;
        }
        // System.out.println("B: " + n);
        // int fact = n * fact(n-1);
        // System.out.println("A: " + n);
        // System.out.println("fact: " + fact);
        // return fact;
        return n * fact(n-1);
    }
    public static void main(String[] args) {
        System.out.println(fact(4));
    }
}
