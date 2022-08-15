package Java.Arrays_and_Collections.Array_Copying;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {10, 7, 8, 9, 1, 5, 85, 64, 31, 42};
        int[] array2= Arrays.copyOf(array1,array1.length);
        int[] array3=Arrays.copyOfRange(array1,2,4);


        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));

        int[] array4=new int[array1.length];
        for (int i = 0; i <array1.length ; i++) {
            array4[i]=array1[i];
        }
        System.out.println(Arrays.toString(array4));

    }
}
