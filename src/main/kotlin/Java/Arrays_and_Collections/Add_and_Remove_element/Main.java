package Java.Arrays_and_Collections.Add_and_Remove_element;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numberlist=new ArrayList<>(Arrays.asList(1,2,3));
        numberlist.add(4);
        numberlist.add(2,7);
        numberlist.addAll(Arrays.asList(7,8));
        numberlist.addAll(0,Arrays.asList(144,8));
        numberlist.removeAll(Arrays.asList(1,3));
        numberlist.remove(3);
        numberlist.clear();
        System.out.println(numberlist);


        List<Integer> arraylist1=new ArrayList<>(Arrays.asList(7,5,9,8,7,1,2,3,6,5,4));
        List<Integer> arraylist2=new ArrayList<>(Arrays.asList(4,1,2,9,8,3,4,7,5,4,9,0));

        arraylist1.addAll(arraylist2);
        arraylist1.removeAll(arraylist2);


        System.out.println(arraylist1);
    }
}
