package Java.Alghorithms.Search.Binary_Search;

public class Main {
    public static void main(String[] args) {
        int[] myarray={2,4,6,8,10,12,14,16,18,20};
        Main main=new Main();
        System.out.println(main.BinarySearch(myarray,3));
    }


    public int BinarySearch(int[] array,int x){
        int i=0;
        int j=array.length; //10

        while (i!=j){
            int m=(i+j)/2; //5
            if (x==array[m]){  //6 ==? 12 not
                System.out.println("element found");
                return m;
            }if (x<array[m]){
                j=m;
            }else {
                i=m+1;
            }

            if (i==j){
                System.out.println("element not found");
            }

        }


        return 0;
    }
}
