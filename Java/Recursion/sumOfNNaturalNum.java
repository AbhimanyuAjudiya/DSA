public class sumOfNNaturalNum {
    public static int sum(int n) {
        if(n == 1){
            System.out.println(n);
            return 1;
        }
        int sum = n + sum(n-1);
        System.out.println(sum + " ");
        return sum;
    }
    public static void main(String[] args) {
        sum(5);
    }
    
}
