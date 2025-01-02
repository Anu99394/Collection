import java.util.*;

public class HashSet_practice {
    public static void main(String[] args) {
        Set<Integer>s=new HashSet<>();
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

//[0, 1, 2, 3, 5, 6, 40, 5000]
