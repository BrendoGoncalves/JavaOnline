package package01.javaonline.core.methodoverload.domain;

public class Dog3 {
    private String name;
    private int age;
    private float weight;

    public Dog3(String name, int age){
        this(); // Need to be the first sentence
        this.name = name;
        this.age = age;
    }

    public Dog3(String name, int age, float weight){
        this(name, age);
        this.weight = weight;
    }

    public Dog3(){
        System.out.println("Au au!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
