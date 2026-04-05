import java.util.*;
public class ArraayListImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<>();      //interfaces = classes
        arrList.add(null);
        arrList.add(5);
        arrList.add(20);
        arrList.add(10);
        System.out.println(arrList);
        System.out.println(arrList.size());
        arrList.set(0,10);
        System.out.println(arrList);
        System.out.println(arrList.size());
        System.out.println(arrList.get(1));
        System.out.println(arrList.remove(1));
        System.out.println(arrList.contains(5));
    }
}