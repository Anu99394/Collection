import java.util.*;

public class TreeSet_practice {
    public static void main(String[] args) {
        TreeSet<Integer> s=new TreeSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(40);
        s.add(50);
        s.add(20);

        System.out.println(s.lower(2));
        System.out.println(s.floor(2));
        System.out.println(s.ceiling(2));
        System.out.println(s.higher(2));
        System.out.println(s);
        System.out.println(s.pollLast());
        System.out.println(s.pollFirst());
        System.out.println(s);
    }
}
//1
//        2
//        2
//        3
//        [1, 2, 3, 20, 40, 50]
//        50
//        1
//        [2, 3, 20, 40]