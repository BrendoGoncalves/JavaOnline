package package01.javaonline.core.methodintroduction.test;

import package01.javaonline.core.methodintroduction.domain.Calculator2;

public class Calculator2Test {
    public static void main(String[] args) {
        byte a = 2, b = 3;
        Calculator2 c1 = new Calculator2();
        c1.doubleNumber(a, b);
        System.out.printf(a + " " + b);
    }
}
