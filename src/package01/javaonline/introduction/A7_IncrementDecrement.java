package package01.javaonline.introduction;

public class A7_IncrementDecrement {
    public static void main(String[] args) {
        byte counter = 0;
        counter += 1;

        // Pre Increment
        ++counter;
        --counter;
        counter++;
        System.out.println(counter);
        System.out.println(++counter);

        // Pos increment
        System.out.println(counter++);
        counter++;

        System.out.println(counter);
    }
}
