package LamdaStreampackage;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTemp {
    public static void main(String[] args) {

        //map and collect
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        List<Integer> square = list.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(square);

        //filter
        List<String> strings = Arrays.asList("Smit", "Cedo", "FIght", "smit");
        List<String> result = strings.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
        System.out.println(result);

        //filter endswith/equals
        List<String> strings1 = (List<String>) strings.stream().filter(s -> s.equals("smit")).filter(s -> s.endsWith("t")).collect(Collectors.toList());
        System.out.println(strings1);

        list.stream().filter(x->x%2==0).forEach(y-> System.out.println(y));

        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Smit");
        hashMap.put(2,"String");
        hashMap.put(3, "Umang");

        List<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("BABAB");

        List<String> list2 = new ArrayList<>();
        list2.add("Krunal Sir");
        list2.add("Party ");

        hashMap.put(4, String.valueOf(list1));
        hashMap.put(5, String.valueOf(list2));
        hashMap.put(6, String.valueOf(list1));

        System.out.println(hashMap.entrySet().stream().filter(e->e.getKey()==4).collect(Collectors.toList()));


        System.out.println(hashMap.keySet().stream().filter(e -> e==2).map(k->k+1).collect(Collectors.toList()));
        System.out.println(hashMap.values().stream().map(k->k+"Hii").collect(Collectors.toList()));
        System.out.println(hashMap.keySet().stream().map(k->k+1).collect(Collectors.toList()));
        System.out.println("++++++++++++++++++++++++++");
        System.out.println(hashMap);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(hashMap.entrySet().stream().filter(e-> e.getValue()=="String").collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue())));

        Map m = hashMap.entrySet().stream().collect(Collectors.toUnmodifiableMap(p -> p.getKey(), p-> p.getValue()));
        System.out.println(m);

        List<String> list3 = Arrays.asList("Smit" , "Umang" , "Krunal" , "hbha", "hafo", "hopppp", "hwidijwi");
        List list4 = list3.stream().filter(s -> s.startsWith("h")).sorted().collect(Collectors.toList());
        System.out.println(list4);

        List<String> list5 = Arrays.asList("5.6", "7.4", "4",
                "1", "2.3");

        list5.stream()
                .flatMap(num -> Stream.of(num)).forEach(System.out::println);

        System.out.println("****************************");
        list3.stream().flatMap(s -> Stream.of(s.charAt(2))).forEach(System.out::println);

        

    }
}
