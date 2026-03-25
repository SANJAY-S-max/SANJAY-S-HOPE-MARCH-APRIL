import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int[] mat=new int[num];
        for(int ind=0;ind<num;ind++){
            mat[ind]=input.nextInt();
        }
        for(int ind1=0;ind1<num;ind1++){
            for(int ind2=ind1+1;ind2<num;ind2++){
                if(mat[ind2]%2==1){
                    int temp=mat[ind1]
                    mat[ind1]=mat[ind2]
                    mat[ind2]=temp;
                    break;
                }
            }
        }
    }
}