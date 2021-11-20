package package01.javaonline.introducao;

/*
 Comment 2
 */

public class A2_TiposPrimitivo {
    public static void main(String[] args) {
        //Integer
        byte var1 = 127; //1 byte = 2^0
        short var2 = 32700; //2 bytes = 2^1
        int var3 = 2000000000; //4 bytes = 2^2
        long var4 = 900000000; //8 bytes = 2^3

        //Float Point
        float var5 = 0.4785F; //4 bytes
        double var6 = 0.9549526247; //8 bytes

        //Caracter
        char var7 = 87; //2 bytes
        char var8 = 'k';

        //Boolean
        boolean var9 = true; //1 bit = 1/8 byte

        System.out.println("Value: "+var9);

        //Casting
        byte var10 = (byte) 150;
        System.out.println("Value: "+var10);
    }
}
