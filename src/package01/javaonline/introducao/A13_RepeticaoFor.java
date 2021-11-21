package package01.javaonline.introducao;

public class A13_RepeticaoFor {
    public static void main(String[] args) {

        for(int i = 0; i < 10; ++i){
            System.out.print(i+ " - ");
        }

        int j = 10;
        for( ; j > 0; --j){
            System.out.print(j+ " - ");
        }

        int k;
        for(k = 5; k <= 30 && (k % 3) < 3; ++k, k *= 2){
            System.out.print(k+ " - ");
        }
    }
}
