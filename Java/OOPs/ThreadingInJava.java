
class MyThreat1 implements Runnable{
    MyThreat1(){
        Thread t1 = new Thread(this);
        t1.start();
    }
    public void run(){
        System.out.println("Runable threat");
    }
}
class MyThreat2 extends Thread{
    MyThreat2(){
        start();
    }
    public void run(){
        System.out.println("Thread threat");
    }
}

public class ThreadingInJava {
    public static void main(String[] args) {
        MyThreat1 t1 = new MyThreat1();
        MyThreat2 t2 = new MyThreat2();
    }
}
