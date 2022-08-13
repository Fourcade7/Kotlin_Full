package Java.Alghorithms.Sorting.Quick_Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers={4,0,50,1,2,7,77,89,97,3,8};
        Main main=new Main();
        main.quickSort(numbers,0, numbers.length-1);
        System.out.println(Arrays.toString(numbers));

    }


    public int partition(int[] array,int low,int high){

        int pivot=array[high];
        int i=low-1;

        for (int j = low; j <=high-1; j++) {

            if (array[j]<pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            
        }

        int temp = array[i];
        array[i] = array[high];
        array[high] = temp;

        return i+1;

    }


    public void quickSort(int[] array,int low,int high){

        if (low<high){
            int pi=partition(array,low,high);
            quickSort(array,low,pi-1);
            quickSort(array,pi+1,high);//wt

        }

    }
}
