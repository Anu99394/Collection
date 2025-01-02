import java.util.*;
public class Vector_practice {
    public static void main(String[] args) {
        Vector<Integer>v=new Vector<>();
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        v.remove(2);
        System.out.println(v);

    }
}
//[2, 3, 5]
