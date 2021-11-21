package package01.javaonline.introducao;

public class A7_Incremento {
    public static void main(String[] args) {
        byte counter = 0;
        counter += 1;

        // Pre Increment
        ++counter;
        System.out.println(counter);
        System.out.println(++counter);

        // Pos increment
        System.out.println(counter++);
        counter++;

        System.out.println(counter);
    }
}
