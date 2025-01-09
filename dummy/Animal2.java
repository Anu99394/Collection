package dummy;

interface Animal2 {

    default void fun()
    {
        System.out.println("fun of animal2");
    }

    static public void fun1()
    {
        System.out.println("fun1");
    }
}
