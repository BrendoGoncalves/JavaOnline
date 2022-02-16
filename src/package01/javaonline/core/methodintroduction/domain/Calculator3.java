package package01.javaonline.core.methodintroduction.domain;

public class Calculator3 {

    public double[] array;

    public void sumArray(int[] array){
        int acum = 0;
        for (int i:array){
            acum += i;
        }
        System.out.println(acum);
    }

    public void varArgs(int... n){
        int acum = 0;
        for (int i = 0; i < n.length; i++) {
            acum += n[i];
        }
        System.out.println(acum);
    }
}
