import java.util.*;

public class Queue_Practice {
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        System.out.println(q.peek());
      //  System.out.println(q.element()); //giving exeception
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.element());

    }
}
//null
//        [1, 2, 3, 4, 5]
//        [2, 3, 4, 5]
//        2
//        2
