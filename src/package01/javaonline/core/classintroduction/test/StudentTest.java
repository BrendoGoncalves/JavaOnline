package package01.javaonline.core.classintroduction.test;

import package01.javaonline.core.classintroduction.domain.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Jonh";
        s1.age = 25;
        s1.gender = 'M';
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.gender);

    }


}
