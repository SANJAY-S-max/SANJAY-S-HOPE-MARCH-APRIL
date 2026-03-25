import java.util.*;
public class trim{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inp=sc.nextLine();
        inp=inp.toLowerCase();
        String trimmed=inp.replaceAll("\\s+", "");
        System.out.print(inp);
        System.out.print(trimmed);
    }
}