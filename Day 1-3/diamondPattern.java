import java.util.*;
public class diamondPattern{
	public static void main(String[] args) {
	    int n;
	    Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
	    n=sc.nextInt();
        System.out.print("\n");
	    for(int i=1;i<=n;i++){          
	        for(int j=1;j<=n-i;j++){ 
	            System.out.print(" ");
	        }
	        for(int k=1;k<=2*i-1;k++){
	            System.out.print("*");
	        }System.out.print("\n");
	    }
	    for(int i=n-1;i>=1;i--){
	        for(int j=1;j<=n-i;j++){
	            System.out.print(" ");
	        }
	        for(int k=1;k<=2*i-1;k++){
	            System.out.print("*");
	        }
	        System.out.print("\n");
	    }
	}
}