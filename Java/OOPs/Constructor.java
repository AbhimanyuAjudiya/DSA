public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Abhimanyu";
        s1.rollNo = 20;
        s1.pass = "abc";

        Student s2 = new Student(s1);
        s2.pass = "xyz";
    }
}


class Student{
    String name;
    int rollNo;
    String pass;


    //Copy Constructor
    Student(Student s1){
        this.name = s1.name;
        this.rollNo = s1.rollNo;
    }

    Student(){
        System.out.println("Non-Parameterized Constructor");
    }

    Student(String name){ // Parameterized Constructor
        this.name = name;
    }
    Student(int rollNo){ // Parameterized Constructor
        this.rollNo = rollNo;
    }
}
