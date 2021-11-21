package package01.javaonline.introducao;

public class A12_RepeticaoDoWhile {
    public static void main(String[] args) {

        int counter = 0;

        do{
            System.out.println("Hi Brazil!");
        }while(counter > 2);

        do{
            System.out.println("Hi Israel");
            counter = 5 % 3;
        }while(counter >= 2);
    }
}
