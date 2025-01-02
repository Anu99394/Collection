import java.util.*;

public class ArrayDeque_practice {
    public static void main(String[] args) {
        ArrayDeque<Integer>q=new ArrayDeque<>();
        q.add(1);
        q.addFirst(2);
        q.addLast(3);
        q.offerFirst(4);
        q.offerLast(5);
        System.out.println(q);
        q.pop();
        System.out.println(q);

        Iterator it=q.iterator();
        while(it.hasNext())
            System.out.print(it.next()+" ");
    }
}
//[4, 2, 1, 3, 5]
//        [2, 1, 3, 5]
//        2 1 3 5