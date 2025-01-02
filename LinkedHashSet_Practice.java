import java.util.*;

public class LinkedHashSet_Practice {
    public static void main(String[] args) {
        Set<Integer>s=new LinkedHashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(40);
        s.add(5);
        s.add(6);
        s.add(0);
        s.add(5000);
        System.out.println(s);
    }
}
//[1, 2, 3, 40, 5, 6, 0, 5000]