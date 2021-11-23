package package01.javaonline.introducao;

public class A16_VetorA {
    public static void main(String[] args) {
        //Reference Variable (Array, String)
        String name = null;
        int[] widths = null;
        //int heigth = null;

        int[] ages = new int[3];

        System.out.println(ages);
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        ages[0] = 40;
        ages[2] = 8;

        for(int i = 0; i < ages.length; ++i){
            System.out.println(ages[i]);
        }
    }
}
