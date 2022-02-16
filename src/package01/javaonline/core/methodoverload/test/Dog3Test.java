package package01.javaonline.core.methodoverload.test;

import package01.javaonline.core.methodoverload.domain.Dog3;

public class Dog3Test {
    public static void main(String[] args) {
        Dog3 d = new Dog3("Lili", 3, 4.5F);
        System.out.println(d.getName());
        System.out.println(d.getAge());
        System.out.println(d.getWeight());
    }
}
