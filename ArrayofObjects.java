class Student {
    int age;
    String name;
    boolean isVerified;
}

public class ArrayofObjects {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.age = 12;
        s1.isVerified = true;
        s1.name = "Ayush";

        Student s2 = new Student();
        s2.age = 14;
        s2.isVerified = false;
        s2.name = "Ankit";

        Student s3 = new Student();
        s3.age = 32;
        s3.isVerified = true;
        s3.name = "Aman";

      
        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        
        for (Student s : students) {
            System.out.println(s.name + " " + s.age + " " + s.isVerified);
        }
    }
}
