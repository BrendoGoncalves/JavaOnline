package package01.javaonline.core.methodoverload.domain;

public class Dog {
    private String name;
    private int age;

    private float weight;

    public void init(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void init(String name, int age, float weight){
        this.init(name, age);
        this.weight = weight;
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
