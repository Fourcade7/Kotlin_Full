package Java.Alghorithms.Search.Linear_Search;

public class Main {

    public static void main(String[] args) {

        int[] numbers={2,4,6,8,10,12,14,16,17,18,20};
        Main main=new Main();

        System.out.println(main.linearSearch(numbers,10));


    }


    public int linearSearch(int[] array,int x){

        int i=0;
        int count=array.length;

        while (i<count){
            if (array[i]==x){
                return i;
            }
            i++;
        }

        return 0;
    }


}
