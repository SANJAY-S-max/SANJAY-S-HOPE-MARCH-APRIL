import java.util.*;
public class Island_check{
    public static void islandCheck(){

    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int row_size=input.nextInt();
        int col_size=input.nextInt();
        int[][] mat=new int[row_size][col_size];
        for(int row=0;row<row_size;row++){
            for(int col=0;col<col_size;col++){
                mat[row][col]=input.nextInt();
            }
        }
        for(int row=0;row<row_size;row++){
            for(int col=0;col<col_size;col++){
                islandCheck(mat[row][col])
            }
        }

    }
}