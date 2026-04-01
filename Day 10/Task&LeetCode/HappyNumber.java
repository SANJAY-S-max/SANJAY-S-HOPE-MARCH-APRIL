import java.util.*;
public class HappyNumber {
    static int square(int num){
        int sum=0;
        while(num!=0){
            sum=sum+(num%10)*(num%10);
            num/=10;
        }
        return sum;
    }
    static boolean isHappy(int n){
        Set<Integer> seen = new HashSet<>();

        while(n != 1 && !seen.contains(n)){
            seen.add(n);
            n = square(n);
        }

        return n == 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isHappy(num));
    }
}
