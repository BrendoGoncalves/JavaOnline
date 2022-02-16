package package01.javaonline.core.methodoverload.test;

import package01.javaonline.core.methodoverload.domain.Dog4;

public class Dog4Test {
    public static void main(String[] args) {
        Dog4 d = new Dog4("Scooby");

        System.out.println(d.name);
        for(int i: d.puppies){
            System.out.println(i);
        }
    }
}
