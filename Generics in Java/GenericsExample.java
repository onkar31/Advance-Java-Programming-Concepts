import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {

        // Example without Generics
        List names = new ArrayList();
        names.add("Oddy");
        String name = (String) names.get(0);
        System.out.println("Name: " + name);
        names.add(7);                               // Not type safe
        // System.out.println((String) names.get(1)); // will give runtime ClassCastException

        // Example with Generics
        List<String> names2 = new ArrayList<>();
        names2.add("Onkar");
        String name2 = names2.get(0);
        System.out.println("Name : " + name2);
        // names2.add(8);                            //will give compile time error
    }
}
