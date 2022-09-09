public class operaters {
    public static void main(String[] args) {
        System.out.println(5 & 6);//101(5) AND(opeartion) 110(6) = 100(4)
        System.out.println(5 | 6);//101(5) OR(opeartion) 110(6) = 111(7)
        System.out.println(5 ^ 6);//101(5) XOR(opeartion) 110(6) = 011(3)
        System.out.println((~(~5))+1);//101(5) NOT(opeartion) = 011(-6) //1's Complement
        System.out.println(5 << 2);//formula to find leftshift is a << b = a * 2ᵇ //in this case 5<<2 = 5*2² = 5*4 = 20
        System.out.println((6 >> 1));//formula to find rightshift is a >> b = a / 2ᵇ //in this case 6>>1 = 6/2¹ = 6/2 = 3
    }
}
