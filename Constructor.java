public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Abhimanyu";
        s1.rollNo = 20;
        s1.pass = "abc";
        s1.marks[0] = 90;
        s1.marks[1] = 80;
        s1.marks[2] = 70;

        Student s2 = new Student(s1);
        s1.marks[1] = 90;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
        s2.pass = "xyz";
    }
}


class Student{
    String name;
    int rollNo;
    String pass;
    int marks[];


    //Copy Constructor
    Student(Student s1){
        this.name = s1.name;
        this.rollNo = s1.rollNo;
        this.marks = s1.marks;
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
