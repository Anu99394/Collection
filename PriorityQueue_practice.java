import java.util.*;

public class PriorityQueue_practice {
    public static void main(String[] args) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        pq.offer(2);
        pq.offer(90);
        pq.offer(3);
        pq.offer(4);
        pq.offer(0);
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);

        Iterator it=pq.iterator();
        while(it.hasNext())
            System.out.print(it.next()+" ");
        System.out.println();
        //see the order

        while(!pq.isEmpty())
        {
            System.out.print(pq.poll()+" ");
        }

    }
}
//[0, 2, 3, 90, 4]
//        [2, 4, 3, 90]
//        2 4 3 90
//        2 3 4 90