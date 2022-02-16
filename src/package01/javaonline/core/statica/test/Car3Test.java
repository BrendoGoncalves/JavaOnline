package package01.javaonline.core.statica.test;

import package01.javaonline.core.statica.domain.Car;
import package01.javaonline.core.statica.domain.Car3;

public class Car3Test {
    public static void main(String[] args) {
        Car3.setLimitSpedy(100);
        System.out.println(Car3.getLimitSpedy());
    }
}
