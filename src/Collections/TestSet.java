package Collections;/*
//hashSet
*/
/*HashSet stores the elements by using a mechanism called hashing.
        HashSet contains unique elements only.
        HashSet allows null value.
        HashSet class is non synchronized.
        HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
        HashSet is the best approach for search operations.
        The initial default capacity of HashSet is 16, and the load factor is 0.75.*/



import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class TestSet {

        public static void main(String[] args) {
            HashSet<ArrayList> set= new HashSet<>();

            ArrayList<Integer> list1 = new ArrayList<>();
            ArrayList<Integer> list2 = new ArrayList<>();

            list1.add(1);
           list1.add(2);
            list2.add(1);
          list2.add(2);
            set.add(list1);
            set.add(list2);

            System.out.println(set.size());

            HashSet<String> h = new HashSet<>();
            h.add("Krunal Sir");
            h.add("Vivek Sir");
            h.add("Smit bro");

            h.add("Smit bro");
            System.out.println(h);
            System.out.println(h.contains("Smit bro"));

            h.remove("Smit bro");

            Iterator<String> i = h.iterator();
            while (i.hasNext()){
                System.out.println(i.next());
            }

            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(1);
            arrayList.add(3);
            arrayList.add(2);
            arrayList.add(4);
            arrayList.add(5);
            arrayList.add(3);
            arrayList.add(2);
            arrayList.add(4);

            HashSet<Integer> arrayLists= new HashSet<>();
            for(int j =0 ; j<arrayList.size(); j++){
                arrayLists.add(arrayList.get(j));
            }
            System.out.println(arrayLists);

            HashSet<ArrayList<String>> hashSet = new HashSet<>();

            ArrayList<String> list = new ArrayList<>();
            ArrayList<String> list13 = new ArrayList<>();
            list.add("smit");
            list.add("Umang");
            list13.add("Umang");
            list13.add("Umang");

            hashSet.add(list);
            hashSet.add(list);
            hashSet.add(list);
            hashSet.add(list);
            hashSet.add(list13);
            hashSet.add(list13);
            hashSet.add(list);
            /*hashSet.add(2);
            hashSet.add(3);
            hashSet.add(1);
            hashSet.add(3);
            hashSet.add(5);*/

            for(ArrayList<String> s : hashSet)
                 System.out.println(s);


            String s1  = "Umang";

            s1= "Krunal";

            System.out.println(s1);






        }

}

