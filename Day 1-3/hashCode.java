import java.util.Scanner;
public class hashCode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int [] arr={1,2,3};
        System.err.println(arr);
        System.err.println(arr.hashCode());
        System.out.println();

        double [] arr2={1.1,2.2,3.3};
        System.err.println(arr2);
        System.err.println(arr2.hashCode());
        System.out.println();

        String[] arr1={"hello","world"};
        System.err.println(arr1);
        System.err.println(arr1.hashCode());
        System.err.println(arr1[0].hashCode());
        System.out.println();

        Integer a=1;
        Integer[] arr3={1,2,3};
        System.out.println(arr3 [0].hashCode()==a.hashCode());
        System.err.println(arr3[0].hashCode()==1);
        

    }
}