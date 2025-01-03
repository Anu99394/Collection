import java.util.*;

class Animal implements Comparable<Animal>
{
    int age;
    String name;
    int weight;


    public Animal(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}'+'\n';
    }

    @Override
    public int compareTo(Animal that) {
        if(this.age==that.age)
            return this.name.compareTo(that.name);
        return this.age-that.age;
    }
}
public class Comparator_practice {
    public static void main(String[] args) {
        Animal a1=new Animal(1,"dog",10);
        Animal a2=new Animal(2,"cat",20);
        Animal a3=new Animal(0,"lion",30);
        Animal a4=new Animal(3,"tiger",40);
        Animal a5=new Animal(3,"cheetah",40);

        List<Animal> l =new ArrayList<>();

        l.add(a1);
        l.add(a2);
        l.add(a3);
        l.add(a4);
        l.add(a5);
        System.out.println(l);

       Collections.sort(l);
        System.out.println(l);
        Iterator it=l.iterator();
        while(it.hasNext()) {
            Animal dummy=(Animal)it.next();
            System.out.println(dummy.getName());
        }
    }
}

//[Animal{age=1, name='dog', weight=10}
//, Animal{age=2, name='cat', weight=20}
//, Animal{age=0, name='lion', weight=30}
//, Animal{age=3, name='tiger', weight=40}
//, Animal{age=3, name='cheetah', weight=40}
//]
//        [Animal{age=0, name='lion', weight=30}
//, Animal{age=1, name='dog', weight=10}
//, Animal{age=2, name='cat', weight=20}
//, Animal{age=3, name='cheetah', weight=40}
//, Animal{age=3, name='tiger', weight=40}
//]
//lion
//        dog
//cat
//        cheetah
//tiger
