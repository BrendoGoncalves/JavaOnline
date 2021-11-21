package package01.javaonline.introducao;

public class A11_RepeticaoWhile {
    public static void main(String[] args) {

        int counter = 0;

        while(counter < 10){
            System.out.println(counter++);
        }

        while(counter > 0){
            System.out.println(counter);
            --counter;
        }

        while(++counter <= 15){
            System.out.println(counter);
        }
    }
}
