package package01.javaonline.introduction;

public class A14_Break {
    public static void main(String[] args) {

        //Break -> Loop(While, DoWhile, For) OR Break -> Switch
        for(int i = 0; i < 10; ++i){
            if(i > 5){
                break;
            }else{
                System.out.println(i);
            }
        }

        /* Mistake
        * if(i < 10){
        *    break;
        * }
        */
    }
}
