import java.util.*;
public class SortedSet_practice {
    public static void main(String[] args) {
        SortedSet<Integer>s=new TreeSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(50);
        s.add(10);
        System.out.println(s);
        System.out.println(s.first());
        System.out.println(s.last());
        System.out.println("subset "+s.subSet(2,50));
        System.out.println("tailSet "+s.tailSet(3));
        System.out.println("headSet "+s.headSet(50));
    }
}
//[1, 2, 3, 4, 10, 50]
//        1
//        50
//subset [2, 3, 4, 10]
//tailSet [3, 4, 10, 50]
//headSet [1, 2, 3, 4, 10]