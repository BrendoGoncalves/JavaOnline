package package01.javaonline.introducao;

public class A8_CondicaoIFSimples {
    public static void main(String[] args) {

        boolean gender = true;
        if(gender){
            System.out.println("Man");
        }
        if(!gender){
            System.out.println("Woman");
        }

        byte number = 1;

        if(number == 0){
            System.out.println("Dark");
        }else{
            System.out.println("Light");
        }
    }
}
