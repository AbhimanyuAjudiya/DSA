public class IntToStr {
    static String str[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    
    public static void ToStr(int number){
        if(number == 0){
            return;
        }
        int lastDigit = number%10;
        ToStr(number/10);
        System.out.print(str[lastDigit]+" ");
    }
    public static void main(String[] args) {
        int n = 3101;
        ToStr(n);
        System.out.println();
    }
}
