package package01.javaonline.core.methodoverload.test;

import package01.javaonline.core.methodoverload.domain.Dog;

public class DogTest {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.init("Lili", 1);
        d.init("Lala", 2, 4.5F);

        System.out.println(d.getName());
        System.out.println(d.getAge());
        System.out.println(d.getWeight());
    }
}
