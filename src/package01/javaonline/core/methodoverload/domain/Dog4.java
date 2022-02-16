package package01.javaonline.core.methodoverload.domain;

public class Dog4 {
    public String name;
    public int[] puppies;

    {
        puppies = new int[100];
        for(int i = 0; i < puppies.length; ++i){
            puppies[i] = i + 1;
        }
    }

    public Dog4(String name){
        this.name = name;
    }
}
