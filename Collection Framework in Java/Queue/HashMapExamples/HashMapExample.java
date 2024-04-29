package HashMapExamples;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> phonebook = new HashMap<>();
        phonebook.put("Abbie", 223456); 
        phonebook.put("oddy", 112233); 
        phonebook.put("gimmy", 565623); 
        phonebook.put("jacob", 90250); 
        phonebook.put("Abbie", 23456);  // Duplicates keys are not allowed, this will override the value
        phonebook.put(null, 0000);
        System.out.println("Phonebook: " + phonebook);  // Hashmap is unordered. 
        if(phonebook.containsKey("gimmy")){
            phonebook.remove("gimmy");
        } 
        System.out.println("After updating phonebook:" + phonebook);
    }
}
