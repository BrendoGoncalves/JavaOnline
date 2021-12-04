package package01.javaonline.introduction;

public class A15_Continue {
    public static void main(String[] args) {

        //Continue -> Loop(While, DoWhile, For)
        for(int i = 0; i < 20; ++i){
            if(i < 10){
                continue;
            }
            System.out.println(i);
        }
    }
}
