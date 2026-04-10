import java.util.*;
public class setImplementation{
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        set.add(1);
        System.out.println(set);
        Integer a =1;
        set.add(a);
        System.out.println(a.hashCode());
        System.out.println(set);
        set.add(3);
        System.out.println(set);
        System.out.println(set.contains(1));


    }
}