package package01.javaonline.introduction;

public class A6_LogicOpe {
    public static void main(String[] args) {
        // && (AND) || (OR) ! (NOT)

        double heigth = 1.8;
        double weight = 80.4;

        boolean isThin = heigth > 1.6 || weight < 60;
        boolean isHeathy = heigth >= 1.8 && weight >= 85;
        boolean isStrong = !(heigth >= 1.6 && weight >= 100);
        System.out.println(isThin);
        System.out.println(isHeathy);
        System.out.println(isStrong);
    }
}
