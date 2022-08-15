package Java.Arrays_and_Collections.Array_with_a_default_value;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array=new int[10];
        Arrays.fill(array,5);

        System.out.println(Arrays.toString(array));
    }
}
