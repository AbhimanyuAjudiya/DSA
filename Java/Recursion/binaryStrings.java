public class binaryStrings {
    public static void printBinStr(int n,int lastIndex,String str) {
        if(n == 0){                             //base case
            System.out.println(str);
            return;
        }

        printBinStr(n-1, 0, str+"0");
        if (lastIndex == 0) {
            printBinStr(n-1, 1, str+"1");
        }

    }
    public static void main(String[] args) {
        printBinStr(3, 0, "");
    }
}
