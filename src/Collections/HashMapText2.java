package Collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapText2 {
    public static void main(String[] args) {
        Map<Integer, String> intType
                = new HashMap<Integer, String>();

        HashMap<String,String> hashMap = new HashMap<>();


        // Inserting data(key-value pairs) in HashMap
        // Custom inputs
        intType.put(1, "First");
        intType.put(2, "Second");
        intType.put(3, "Third");
        intType.put(4, "Fourth");

        //EntrySet
        System.out.println(intType.entrySet());


        // Iterating every set of entry in the HashMap, and
        // printing all elements of it
        intType.entrySet().stream().forEach( input -> System.out.println(input.getKey() + " : " + input.getValue()));


        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        //Iterating through Lamda Expression
        intType.forEach((key, value)-> System.out.println(key + " : " + value));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        Iterator<Map.Entry<Integer, String>> iterator = intType.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<Integer,String> newMap = iterator.next();
            System.out.println(newMap.getKey() + " : " + newMap.getValue() + " : " + newMap.hashCode());
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

        //For
        for (Map.Entry<Integer,String> set : intType.entrySet()){
            System.out.println(set.getKey() + " : " + set.getValue());
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");


    }
}
