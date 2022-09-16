public class PrintNumInDecr {

    public static void printNum(int n) {
        if(n<0){
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }

    public static void fact(int n) {
        if(n==1){
            System.out.println(n);
            return;
        }
        fact(n*n-1);
    }
    public static void main(String[] args) {
        fact(2);
    }
}