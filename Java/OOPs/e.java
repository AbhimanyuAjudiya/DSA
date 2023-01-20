class Student1{
    Student1(){
        System.out.println("Student1 Constructor called");
    }
    void disp(){
        System.out.println("Student1");
    }
}
class Student2 extends Student1{
    Student2(){
        System.out.println("Student2 Constructor called");
    }
    void disp(){
        super.disp();
        System.out.println("Student2");
    }
}
class Student3 extends Student2{
    Student3(){
        System.out.println("Student3 Constructor called");
    }
    void disp(){
        super.disp();
        System.out.println("Student3");
    }
}
public class e {
    public static void main(String[] args) {
        Student3 s = new Student3();
        s.disp();
    }
}
