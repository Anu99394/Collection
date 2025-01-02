import java.util.*;
public class Stack_practice {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.add(2);
        s.add(3);
        s.add(5);
        s.add(20);
        System.out.println(s);
        s.remove(2);
        s.pop();
        System.out.println(s);
    }
}

//[2, 3, 5, 20]
//        [2, 3]
