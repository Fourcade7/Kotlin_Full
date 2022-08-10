package Java.Alghorithms.Search.Fast_linear_Search;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    }


    public int fastlinearSearch(ArrayList<Integer> arrayList, int x){
        int i=0;
        int count=arrayList.size();
        arrayList.add(x);
        while (true){
            if (arrayList.get(i)==x){
                if (i<count){
                    return i;
                }else {
                    return -1;
                }
            }
            i++;
        }


    }
}
