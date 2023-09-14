public class ststicInIt {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "ST Francis";
        Student s2 = new Student();
        System.out.println(s2.schoolName);
    }
}

class Student10{
    String schoolName;
    void setNmae(String name){
        schoolName = name; 
    }
    String getName(){
        return schoolName;
    }
}