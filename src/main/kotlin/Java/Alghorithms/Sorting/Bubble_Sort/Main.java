package Java.Alghorithms.Sorting.Bubble_Sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myarray = {5, 4, 8, 9, 0, 1, 3, 7, 44, 3};

        Main main = new Main();
        main.bubbleSort(myarray);

    }

    public int[] bubbleSort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(array));

        return array;
    }


}
