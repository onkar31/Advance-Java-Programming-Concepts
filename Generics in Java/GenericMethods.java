import java.util.ArrayList;
import java.util.List;

public class GenericMethods {
    static Character[] charArray = {'h', 'e', 'l', 'l','o'};
    static Integer[] intArray = {1, 2, 3, 4, 5};
    static Boolean[] boolArray = {true, false, true};

    //without Generic method
    /* 
    public static List arrayToList(Object[] array, List<Object> list){
        for(Object object : array){
           list.add(object);
        }
        return list;
    }
    */

    //with Generics Method
    public static <T> List<T> arrayToList(T[] array, List<T> list){
        for(T object : array){
           list.add(object);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Character> charList = arrayToList(charArray, new ArrayList<>());
        List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());
     // List<String> intList = arrayToList(intArray, new ArrayList<>());   --> won't give compile time & run time error if we are using Non-Generic method.
        List<Integer> intList = arrayToList(intArray, new ArrayList<>());   // will give compile time error if we are trying to store int list in list of Strings.
        System.out.println(charList);
        System.out.println(boolList);
        System.out.println(intList);
    }
}
