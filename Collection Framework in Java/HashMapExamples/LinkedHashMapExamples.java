package HashMapExamples;

import java.util.LinkedHashMap;
import java.util.Map;

// To maintain the Order of HashMap

public class LinkedHashMapExamples {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> phonebook = new LinkedHashMap<>();
        phonebook.put("kevin", 11223344);
        phonebook.put("Jill", 23456789);
        phonebook.put("Brenda", 99775533);
        phonebook.put("Oddy", 88996655);
        System.out.println("Kevin's number:" + phonebook.get("kevin") );

        System.out.println("\nList of contacts in phonebook:");
        for(Map.Entry<String, Integer> entry : phonebook.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("\n--------------LinkdeHashMap Ordering mode false--------------------");
        linkedHashMapConstructor(4, 0.75f, false);
        
        System.out.println("---------------LinkdeHashMap Ordering Mode true--------------------");
        // The Key accessed/modified last will go at last index of map.
        // Similarly the Key modified earliest will appear at first index of map.
        linkedHashMapConstructor(4, 0.75f, true);

    }
        public static void linkedHashMapConstructor(int sizeOfMap, float loadFactor, boolean orderingMode) {
            LinkedHashMap<String, Integer> marks = new LinkedHashMap<>(sizeOfMap, loadFactor, orderingMode);
            marks.put("Ganu", 88);
            marks.put("Manu", 90);
            marks.put("Lalu", 75);
            marks.put("Chinu", 60);
            System.out.println("Ganu's marks:" + marks.get("Ganu") );
    
            System.out.println("\nStudent marks:");
            for(Map.Entry<String, Integer> entry : marks.entrySet()){
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
}
