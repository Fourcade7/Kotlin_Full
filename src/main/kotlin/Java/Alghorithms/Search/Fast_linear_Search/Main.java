package Java.Alghorithms.Search.Fast_linear_Search;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        Main main = new Main();

        integerArrayList.add(2);
        integerArrayList.add(4);
        integerArrayList.add(8);
        integerArrayList.add(10);
        integerArrayList.add(12);
        integerArrayList.add(14);

        System.out.println(main.fastlinearSearch(integerArrayList, 10));

    }


    public int fastlinearSearch(ArrayList<Integer> arrayList, int x) {
        int i = 0;
        int count = arrayList.size();
        arrayList.add(x);
        while (true) {
            if (arrayList.get(i) == x) {
                if (i < count) {
                    return i;
                } else {
                    return -1;
                }
            }
            i++;
        }


    }
}
