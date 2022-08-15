package Java.Alghorithms.Sorting.Bubble_Sort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myarray = {5, 4, 8, 9, 0, 1, 3, 7, 44, 3};

        Main main = new Main();
        main.bubbleSort(myarray);
        System.out.println(Arrays.toString(myarray));

        Arrays.sort(myarray); //simple
       


    }

    public int[] bubbleSort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
                System.out.println("i="+i);
                System.out.println("j="+j);

            }
        }


        return array;
    }


}
