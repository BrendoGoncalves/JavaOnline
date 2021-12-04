package package01.javaonline.introduction;

public class A19_ArrayD {
    public static void main(String[] args) {
        int[][] array1 = new int[4][];
        int[] array2 = {3, 2, 0};

        array1[0] = new int[2];
        array1[1] = new int[]{4, 7, 8, 0, 9};
        array1[2] = new int[8];
        array1[4] = array2;

        int[][] array3 = {{5, 7}, {9, 1}};

        for (int[] i : array1) {
            System.out.println();
            for (int j : i) {
                System.out.print(j);
            }
        }
    }
}
