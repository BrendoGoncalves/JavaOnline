package package01.javaonline.introduction;

public class A17_ArrayB {
    public static void main(String[] args) {
        int[] array1 = new int[2];
        int[] array2 = {1, 2, 3};
        int[] array3 = new int[] {9, 2, 7, 3, 5};

        for(int j: array3){
            System.out.println(j);
        }

        /* What happend in this FOR
        int j = array3[0];
        int j = array3[1];
        .. until int j = array3[4];
         */
    }
}
