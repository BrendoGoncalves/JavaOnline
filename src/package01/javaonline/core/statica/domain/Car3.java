package package01.javaonline.core.statica.domain;

public class Car3 {

    private String name;
    private int maxSpeedy;
    private static int limitSpedy = 180;

    public Car3(String name, int maxSpeedy) {
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

    public static void setLimitSpedy(int limit){
        limitSpedy = limit;
    }

    public static int getLimitSpedy(){
        return limitSpedy;
    }
}
