package Java.Arrays_and_Collections.Arrays_Initialization;

public class Main {
    public static void main(String[] args) {

        //empty array
        int[] arr1=new int[]{};
        int[] arr2={};

        //single demensional array
        int[] arr3=new int[]{1,2,3};
        int[] arr4={1,2,3};

        //multidimensional array
        int[][] arr5={{1,2,3,3},{4,5,6,7}};

        int[][] arr = { { 1, 2 }, { 3, 4 } };
        System.out.println("arr[0][0] = " + arr[0][0]);


    }
}
