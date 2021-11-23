package package01.javaonline.introducao;

public class A17_VetorB {
    public static void main(String[] args) {
        int[] array1 = new int[2];
        int[] array2 = {1, 2, 3};
        int[] array3 = new int[] {1, 2, 3, 4, 5};

        for(int j: array3){
            System.out.println(array3);
        }

        /* What happend in this FOR
        int j = array[0];
        int j = array[1];
        .. until int j = array[5];
         */
    }
}
