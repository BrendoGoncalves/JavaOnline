package package01.javaonline.core.statica.domain;

public class Car {
    private String name;
    private int maxSpeedy;
    public static int limitSpedy = 180;

    public Car(String name, int maxSpeedy) {
        this.name = name;
        this.maxSpeedy = maxSpeedy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeedy() {
        return maxSpeedy;
    }

    public void setMaxSpeedy(int maxSpeedy) {
        this.maxSpeedy = maxSpeedy;
    }

}
