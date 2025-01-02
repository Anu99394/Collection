import java.util.*;

public class TeeMap_practice {
    public static void main(String[] args) {
        TreeMap<Integer,Integer>m=new TreeMap<>();
        for(int i=1;i<10;i++)
            m.put(i,i+1);

        System.out.println(m);
        System.out.println(m.firstKey());
        System.out.println(m.lastKey());
        System.out.println(m.ceilingKey(2));
        System.out.println(m.lowerKey(2));
        System.out.println(m.higherKey(2));
        System.out.println(m.floorKey(2));
        System.out.println(m.pollFirstEntry());
        System.out.println(m.pollLastEntry());
        System.out.println(m);
        System.out.println(m.subMap(3,8));
        System.out.println(m.tailMap(5));
        System.out.println(m.headMap(5));
        System.out.println(m.descendingMap());

    }
}
//{1=2, 2=3, 3=4, 4=5, 5=6, 6=7, 7=8, 8=9, 9=10}
//        1
//        9
//        2
//        1
//        3
//        2
//        1=2
//        9=10
//        {2=3, 3=4, 4=5, 5=6, 6=7, 7=8, 8=9}
//        {3=4, 4=5, 5=6, 6=7, 7=8}
//        {5=6, 6=7, 7=8, 8=9}
//        {2=3, 3=4, 4=5}
//        {8=9, 7=8, 6=7, 5=6, 4=5, 3=4, 2=3}