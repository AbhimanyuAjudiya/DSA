public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
    
}
class Animal{
    String  color;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breath");
    }
}

//Inheritance
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("can swim");
    }
}