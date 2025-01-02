import java.util.*;
public class HashMap_practice {
    public static void main(String[] args) {
        Map<Integer,Integer> m=new HashMap<>();
        m.put(2,2);
        m.putIfAbsent(2,4);
        m.put(3,3);
        System.out.println(m.get(2));
        System.out.println(m.containsKey(2));
        System.out.println(m.containsValue(5));
        m.remove(2);
        System.out.println(m);
        m.put(2,2);
        System.out.println(m.size());
        m.clear();
        System.out.println(m.isEmpty());

        Map<String,String>map=new HashMap<>();
        map.put("anu","anu1");
        map.put("anu1","anu2");

        System.out.println(map);
        for(String key:map.keySet())
            System.out.println(key+" "+map.get(key));

        for(String value:map.values())
            System.out.println(value);
    }
}

//2
//        true
//        false
//        {3=3}
//        2
//        true
//        {anu1=anu2, anu=anu1}
//anu1 anu2
//anu anu1
//anu2
//        anu1
