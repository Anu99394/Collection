package dummy;

class Dog implements Animal, Animal2{
    public void sound()
    {
        System.out.println("print Dog");
    }

    public void fun()
    {
        Animal.super.fun();
        Animal2.super.fun();
    }

    public void fun1()
    {
        Animal.fun1();
        Animal2.fun1();
    }
}
