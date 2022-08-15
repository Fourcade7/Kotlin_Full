package Java.Arrays_and_Collections.Arrays_Merging;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array1 = {10, 7, 8, 9, 1, 5, 85, 64, 31, 42};
        int[] array2 = {5, 4, 8, 9, 0, 1, 3, 7, 44, 3};

        int[] arraysall=new int[array1.length+array2.length];

        System.arraycopy(array1,0,arraysall,0,array1.length);
        System.arraycopy(array2,0,arraysall,array1.length,array2.length);

        System.out.println(Arrays.toString(arraysall));

    }
}
