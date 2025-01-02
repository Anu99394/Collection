import java.util.*;

public class LinkedList_practice {
    public static void main(String[] args) {
        LinkedList<Integer>l=new LinkedList<Integer>();
        l.push(3);
        l.push(2);
        l.push(1);
        System.out.println(l);
        l.pop();
        System.out.println(l);

        ListIterator it=l.listIterator();

        while(it.hasNext())
            System.out.println(it.next());

        while(it.hasPrevious())
            System.out.println(it.previous());

    }

}
//[1, 2, 3]
//        [2, 3]
//        2
//        3
//        3
//        2
