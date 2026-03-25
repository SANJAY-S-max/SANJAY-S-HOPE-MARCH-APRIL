import java.util.*;
public class AtoZ{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int flag=0;
        for(char ch:s){
		flag=flag|(1<<(ch-'a'));
	}
    System.out.print((flag==(1<<26)-1)?"YES":"NO");

    }
}