package package01.javaonline.introducao;

public class A15_Continue {
    public static void main(String[] args) {

        //Continue -> Loop(While, DoWhile, For)
        for(int i = 0; i < 20; ++i){
            if(i < 10){
                continue;
            }else{
                System.out.println(i);
            }
        }
    }
}
