package Advanced_java;
import java.util.*;
import java.util.stream.Collectors;

public class StreamApi_practice {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        for(int i=1;i<=10;i++)
            list.add(i);
        list.add(10);
        System.out.println(list);

        List<Integer>l=list.stream()
                .filter(x->x%2==0)
                .peek(x-> System.out.print(x+" "))
                .map(x->x/2)
                .distinct()
                .sorted((a,b)->(b-a))
                .collect(Collectors.toList());

                int dummy=list.stream()
                .filter(x->x%2==0)
                .peek(x-> System.out.print(x+" "))
                .map(x->x/2)
                .distinct()
                .sorted((a,b)->(b-a))
                .max((a,b)->a-b)
                        .get();

                Long count=list.stream()
                        .filter(x->x%2==0)
                        .peek(x-> System.out.print(x+" "))
                        .map(x->x/2)
                        .distinct()
                        .sorted((a,b)->(b-a))
                        .count();


        System.out.println(l);
        System.out.println(dummy);
        System.out.println(count);
    }
}
//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//        2 4 6 8 10 2 4 6 8 10 2 4 6 8 10 [5, 4, 3, 2, 1]
//        5
//        5