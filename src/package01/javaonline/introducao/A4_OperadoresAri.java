package package01.javaonline.introducao;

public class A4_OperadoresAri {
    public static void main(String[] args) {
        // + - / * %
        int numberA = 20;
        int numberB = 4;
        int numberC = 20 * 4;

        System.out.println(numberA+numberB+ " --- " +numberA+numberB);
        System.out.println(numberC-(numberA/numberB));
        // += -= /= *= %=

        int numberD = 5;
        double numberE = 2;
        double numberF = numberD/numberE;
        System.out.println(numberF);

        int numberG = numberA % 3;
        System.out.println(numberG);
    }
}
