import java.util.*;
public class array_insert{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int num=inp.nextInt();
        int[] arr=new int[10];
        for(int ind=0;ind<num;ind++)
        {
            arr[ind]=inp.nextInt();
        }
        int loc=inp.nextInt();
        int element=inp.nextInt();
        for(int ind=num+1;ind>=loc-1;ind--)
        {
            arr[ind]=arr[ind-1];
        }
        arr[loc-1]=element;
        for(int ind=0;ind<num+1;ind++)
        {
            System.out.print(arr[ind]+" ");
        }
    }
}