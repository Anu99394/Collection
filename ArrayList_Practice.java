import java.util.*;

public class ArrayList_Practice {
    public static void main(String[] args) {
        ArrayList<Integer> l =new ArrayList<>();
        l.add(2);
        l.add(1);
        l.add(3);
        l.add(3);
        System.out.println(l);
        Iterator it=l.iterator();
        while(it.hasNext())
            System.out.println(it.next());

        ListIterator i=l.listIterator();

        while(i.hasNext()) {
            System.out.println(i.next());
        }

        while(i.hasPrevious()) {
            Integer element=(Integer) i.previous();
            if(element==1)
                i.add(4);
            //System.out.println(i.previous());
        }

        System.out.println(l);

        Collections.sort(l);

        System.out.println(l);

//        Collections.reverse(l);

        int index1=Collections.binarySearch(l,5);
        int index2=Collections.binarySearch(l,5);
        System.out.println(index1);
        System.out.println(index2);

    }
}
//[2, 1, 3, 3]
//        2
//        1
//        3
//        3
//        2
//        1
//        3
//        3
//        [2, 4, 1, 3, 3]
//        [1, 2, 3, 3, 4]
//        -6
//        -6
