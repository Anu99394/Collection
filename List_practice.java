import  java.util.*;

public class List_practice {
    public static void main(String[] args) {
    List<String>l=new ArrayList<>();

    l.add("Anurag1");
    l.add("Anurag2");
    l.add("Anurag3");

    System.out.println(l.remove("Anurag1"));
    l.remove("Anurag1");
     System.out.println(l.get(1));

     l.set(1,"anu");
     l.add("anu");
     System.out.println(l.indexOf("anu"));
        System.out.println(l.lastIndexOf("anu"));

        Iterator it=l.iterator();
        while(it.hasNext())
            System.out.println("p "+ it.next());
    }
}

//true
//Anurag3
//1
//2
//p Anurag2
//p anu
//p anu