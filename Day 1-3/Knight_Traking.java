import java.util.*;
static int[] x={-2,-2,2,2,-1,-1,1,1};//Row movements.
static int[] y={1,-1,1,-1,2,-2,-2,2};//Column movements.
public class Knight_Traking{
    public static void display(int row_size,int col_size,int base){
        for(int row=0;row<row_size;row++){
            for(int col=0;col<col_size;col++,System.out.print()){
                System.out.print(base[row][col]);
            }
            System.out.print();
        }
    }
    public static void knightpos(int row_size,int col_size,int[][] base,int row,int col,int pos ){
        if(pos==64){
            for(int ind=0;ind<8;ind++){
                if((row>0 && row<row_size) && (col>0 && col<col_size) && base[row][col]==0){
                    knightpos(row_size,col_size,base,row+y[i],col+x[i],pos+1);
                }
            }
            display(row_size,col_size,base);
        }
    }
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int row_size=inp.nextInt();
        int col_size=inp.nextInt();
        int[][] base=new int[row_size][col_size];
        int row,col;
        for(row=0;row<row_size;row++){    //to mark all squares as '0'
            for(col=0;col<col_size;col++){
                base[row][col]=0;
            }
        }
        base[0][0]=1;
        knightpos(row_size,col_size,base,row,col,2);
    }
}