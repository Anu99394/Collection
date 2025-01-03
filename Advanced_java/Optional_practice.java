package Advanced_java;
import java.util.*;

public class Optional_practice {
    public static void main(String[] args) {
        Optional<String>optional1=getName(2);
        Optional<String>optional2= optional1.map(x->x.toUpperCase());
        optional2.ifPresent(x-> System.out.println(x));
    }

    private static Optional<String> getName(int id) {
        return Optional.of("Ram");
    }
}
