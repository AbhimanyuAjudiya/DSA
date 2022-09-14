public class ststicInIt {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "ST Francis";
        Student s2 = new Student();
        System.out.println(s2.schoolName);
    }
}

class Student{
    static String schoolName;
    void setNmae(String schoolname){
        this.schoolName = schoolName;
    }
    String getName(){
        return schoolName;
    }
}