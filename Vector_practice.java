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


        Vector<String> vector = new Vector<>();
        vector.add("Alice");
        vector.add("Bob");
        vector.add("Charlie");

        // Get the Enumeration object
        Enumeration<String> enumeration = vector.elements();

        // Traverse elements using Enumeration
        System.out.println("Traversing elements using Enumeration:");
        while (enumeration.hasMoreElements()) {
            String element = enumeration.nextElement();
            System.out.println(element);
        }

    }
}
//[2, 3, 5]
