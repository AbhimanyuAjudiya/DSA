public class BitManipulation {

    public static int getIthBit(int n, int i) {
        int bitMask = 1<<i;
        return ((n&bitMask) == 0 ? 0 : 1);
    }

    public static void OddEven(int n) {
        System.out.println((n & 1) == 0 ? "Even" : "Odd");
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int clearIBit(int n, int i) {
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {

        // if (newBit == 0) {
        //     return clearIthBit(n, i);
        // } else {
        //     return setIthBit(n, i);
        // }

        n = clearIthBit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }

    public static int clearRangeOfBits(int n, int i, int j) {
        int a = (~0)<<j+1;
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n&bitMask;
    }

    public static boolean isPowerOfTwo(int n) {
        return ((n & (n-1)) == 0);
    }

    public static int countSetBits(int n) {
        int count = 0;
        while(n > 0){
            if((n&1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    public static int fastExpo(int a, int n) {
        int ans = 1;
        while(n > 0){
            if((n & 1) != 0){// checking LSB
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fastExpo(3, 5));
    }
}
