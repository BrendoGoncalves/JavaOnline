package package01.javaonline.core.statica.test;

import package01.javaonline.core.statica.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", 200);
        Car c2 = new Car("Mecedes", 220);

        System.out.println(c1.getName() + " " + c1.getMaxSpeedy() + " " + Car.limitSpedy);
        System.out.println(c2.getName() + " " + c2.getMaxSpeedy() + " " + Car.limitSpedy);

        //c1.limitSpedy = 500;
        Car.limitSpedy = 500;

        System.out.println(c1.getName() + " " + c1.getMaxSpeedy() + " " + Car.limitSpedy);
        System.out.println(c2.getName() + " " + c2.getMaxSpeedy() + " " + Car.limitSpedy);
    }
}
