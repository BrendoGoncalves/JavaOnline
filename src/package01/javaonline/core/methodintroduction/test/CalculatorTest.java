package package01.javaonline.core.methodintroduction.test;

import package01.javaonline.core.methodintroduction.domain.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();

        c1.sumNumber();
        c1.subNumber(6, 3);

        System.out.println(c1.mulNumber(5));

        c1.divNumber(0);
    }
}
