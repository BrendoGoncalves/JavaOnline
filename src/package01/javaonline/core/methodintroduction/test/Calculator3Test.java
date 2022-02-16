package package01.javaonline.core.methodintroduction.test;

import package01.javaonline.core.methodintroduction.domain.Calculator3;

public class Calculator3Test {
    public static void main(String[] args) {
        Calculator3 c1 = new Calculator3();

        int[] number = {1, 2, 3};
        c1.sumArray(number);
        c1.sumArray(new int[]{5, 3});

        c1.varArgs(4, 5, 9);

        c1.array = new double[]{1.3 ,7.5, 4.9};
        System.out.println(c1.array[0] + " " + c1.array[1] + " " + c1.array[2]);
    }
}
