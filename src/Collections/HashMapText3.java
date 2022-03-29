package Collections;

import java.util.*;

class Temp{
    String name;
}

public class HashMapText3 {
    public static void main(String[] args) {
        Temp e1;
        e1 = null;
        HashMap<Integer,String> hashMap =new HashMap<>();
        hashMap.put(1,"Umang");
        hashMap.put(2,"Krunal Sir");
        hashMap.put(3, "Chaitas Sir");
        hashMap.put(4, "La lavida");
        hashMap.put(5, "Goa");

        hashMap.put(6, String.valueOf(6));
        hashMap.put(7, String.valueOf(6));

      //  hashMap.put(6, "Add");

        System.out.println(hashMap.get(6).hashCode());
        System.out.println(hashMap.get(7).hashCode());

        System.out.println("+++++++++++++++++++++++");
        System.out.println(hashMap.containsKey(3));


        String i = hashMap.get(1);
        System.out.println(i);

        System.out.println(hashMap.size());

        HashMap<Temp,String> temp1 = new HashMap<>();
        temp1.put(e1,"25");
        System.out.println(temp1.get(e1));
        System.out.println(temp1.get(null));


        HashMap<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.put(11,"babahafr");

        hashMap1.put(12,"babahajj");

        hashMap1.put(13,"babahaff");

        hashMap1.put(14,"babahar");

        hashMap.putAll(hashMap1);
        System.out.println("******************************************");
        System.out.println(hashMap);

        System.out.println(hashMap.equals(hashMap1));

        HashMap<String, Integer> prices = new HashMap<>();

        // insert entries to the HashMap
        prices.put("Shoes", 200);
        prices.put("Bag", 300);
        prices.put("Pant", 150);
        System.out.println("Normal Price: " + prices);

        System.out.print("Discounted Price: ");

        // pass lambda expression to forEach()
        prices.forEach((key, value) -> {

            // decrease value by 10%
            value = value - value * 10/100;
            System.out.println(key + "=" + value + " ");
        });
        System.out.println("++++++++++++++++++++++++++++");
        hashMap.compute(1 ,(key, value) -> value.concat("Sharma"));
        System.out.println(hashMap);

        prices.compute("Shoes", (key, val) -> val + 2000);
        System.out.println(prices.get("Shoes"));

        prices.computeIfAbsent("Shoes", k->2300);
        prices.computeIfAbsent("Humans", k->2300);
        System.out.println(prices);
        prices.computeIfPresent("Shoes", (k, V)-> V + 2300);
        System.out.println(prices.get("Shoes"));

        prices.compute("Dinesh", (k,v) -> 1000);
        System.out.println(prices);

        prices.putIfAbsent("Smitpant" , 9000);
        System.out.println(prices);

        System.out.println(prices.computeIfAbsent("Smii", k->2300));
        System.out.println( prices.putIfAbsent("oppop" , 9000));
        System.out.println(prices);

        prices.replace("Shoes", 4500, 1000);
        hashMap.replaceAll((k,v) -> v.toUpperCase(Locale.ROOT));
        System.out.println(hashMap);
        System.out.println(prices);

        final int[] LastElement = new int[1];
        List<String> ll = new ArrayList<>();
        hashMap.forEach((key, value)->{
            ll.add(value);
            LastElement[0] = key;
        });
        System.out.println(LastElement[0]);
        LastElement[0] = 20;
        System.out.println(LastElement[0]);

        final ArrayList<String> arrayList = new ArrayList<>(3);
        arrayList.add("hi");
        arrayList.add("hello");
        arrayList.add("hi");
        arrayList.add("hello");
        System.out.println(arrayList);


       /* ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList = (ArrayList<String>) arrayList1.clone();*/




    }
}
