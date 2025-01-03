package Advanced_java;
import java.util.*;

public class FunctionalInterfaceAndLambdaExpression_practice {
    public static void main(String[] args) {
        Employee e1=() -> "software Engineer";
        System.out.println(e1.getName());

        int a=100;
        // Lambda expression implementation of DivideByTen
        DivideByTen dummy=n-> n/10;
        // Use the functional interface method
        System.out.println(dummy.divide(a));

        int x=10;
        int y=20;
        sum s=(c,b)->c+b;
        System.out.println(s.getSum(x,y));

    }
}

//software Engineer
//10
//        30
