package package01.javaonline.core.methodintroduction.domain;

public class Calculator {
    public void sumNumber(){

        System.out.println(2 + 2);
    }

    public void subNumber(int n1, int n2){

        System.out.println(n1 - n2);
    }

    public int mulNumber(int n1){

        return n1 * 2;
    }

    public void divNumber(int n1){
        if(n1 == 0){
            System.out.println("Blue");
            return;
        }
        System.out.println("Red");
    }

}
