package package01.javaonline.core.methodintroduction.test;

import package01.javaonline.core.methodintroduction.domain.Person;
import package01.javaonline.core.methodintroduction.domain.ChangePerson;

public class PersonTest {
    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person();

        ChangePerson cp = new ChangePerson();

        p1.name = "Mary";
        p1.cpf = "75312687200";

        p2.name = "Kyle";
        p2.cpf = "7856712049";

        System.out.println(p1.name + " - " + p1.cpf);
        System.out.println(p2.name + " - " + p2.cpf);

        cp.print(p1);

        System.out.println(p1.name + " - " + p1.cpf);
        System.out.println(p2.name + " - " + p2.cpf);
    }
}
