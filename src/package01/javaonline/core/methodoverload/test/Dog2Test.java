package package01.javaonline.core.methodoverload.test;

import package01.javaonline.core.methodoverload.domain.Dog2;

public class Dog2Test {
    public static void main(String[] args) {
        Dog2 d = new Dog2("Lala", 2, 4.5F);

        System.out.println(d.getName());
        System.out.println(d.getAge());
        System.out.println(d.getWeight());
    }
}
