import java.util.*;

class Animal1  {
    int age;
    String name;
    int weight;

    public Animal1(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}'+'\n';
    }

    public String getName() {
        return name;
    }

}
public class comparable_practice {
    public static void main(String[] args) {
        Animal1 a1=new Animal1(1,"dog",10);
        Animal1 a2=new Animal1(2,"cat",20);
        Animal1 a3=new Animal1(0,"lion",30);
        Animal1 a4=new Animal1(3,"tiger",40);
        Animal1 a5=new Animal1(3,"cheetah",40);

        List<Animal1> l =new ArrayList<>();

        l.add(a1);
        l.add(a2);
        l.add(a3);
        l.add(a4);
        l.add(a5);

        Collections.sort(l, ( o1, o2) ->  o1.age-o2.age);
        System.out.println(l);

        int a[][]={
                {1,2,3},
                {2,3,4},
                {0,1,3}
        };

        Arrays.sort(a,(arr1,arr2) -> arr1[0]-arr2[0]);

        for(int e[]:a)
        {
            for(int element:e)
                System.out.print(element+" ");
            System.out.println();
        }
    }
}

//[Animal1{age=0, name='lion', weight=30}
//, Animal1{age=1, name='dog', weight=10}
//, Animal1{age=2, name='cat', weight=20}
//, Animal1{age=3, name='tiger', weight=40}
//, Animal1{age=3, name='cheetah', weight=40}
//]
//        0 1 3
//        1 2 3
//        2 3 4 

