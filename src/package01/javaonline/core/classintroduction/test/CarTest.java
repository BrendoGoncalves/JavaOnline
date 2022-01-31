package package01.javaonline.core.classintroduction.test;
import package01.javaonline.core.classintroduction.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        c1.name = "Celta";
        c1.year = 2006;
        c1.model = "Life";

        c2.name = "Palio";
        c2.year = 2004;
        c2.model = "Fire";

        System.out.println(c1.name + "  " + c1.year + "  " + c1.model);
        System.out.println(c2.name + "  " + c2.year + "  " + c2.model);

        c2 = c1;

        System.out.println(c1.name + "  " + c1.year + "  " + c1.model);
        System.out.println(c2.name + "  " + c2.year + "  " + c2.model);
    }
}
