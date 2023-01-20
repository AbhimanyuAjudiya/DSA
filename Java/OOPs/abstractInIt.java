import javax.crypto.MacSpi;


public class abstractInIt {
    public static void main(String[] args) {
        dog tommy = new dog();
        tommy.eat();
        tommy.walks();
    }
}

abstract class Animal{
    void eat(){
        System.out.println("eats");
    }

    abstract void walks();
}

class dog extends Animal{
    void walks(){
        System.out.println("Walks on 4 legs");
    }
}
