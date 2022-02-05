package package01.javaonline.core.methodintroduction.test;

import package01.javaonline.core.methodintroduction.domain.Person;
import package01.javaonline.core.methodintroduction.domain.PrintPerson;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        PrintPerson pp = new PrintPerson();

        p.name = "Mary";
        p.cpf = "75312687200";

        System.out.println(p.name + " - " + p.cpf);

        pp.print(p);

        System.out.println(p.name + " - " + p.cpf);
    }
}
