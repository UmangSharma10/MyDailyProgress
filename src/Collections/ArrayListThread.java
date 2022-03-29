package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//Two ways to create Syncronized arrayList
//1.Sc
public class ArrayListThread {
    public static void main(String[] args) {
        List<Integer> al = Collections.synchronizedList(new ArrayList<>());
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);


            Iterator<Integer> it = al.iterator();

            for(Integer elements : al){
                       if(elements == 3){
                           al.remove(elements);
                       }
            }
            while (it.hasNext()) {
                Integer value = it.next();
                // System.out.println("List Value:" + value);
                if (value == 3)
                    it.remove();


            }
            System.out.println(al);

//        List<String> list = Collections.synchronizedList(new ArrayList<>());
//        list.add("Smit");
//        list.add("Umang");
//        list.add("aabab");
//        list.add("ajbaa");
//
//        synchronized (list){
//            Iterator it1 = list.iterator();
//            while (it1.hasNext()){
//                String str = (String) it1.next();
//
//                if(str.equals("smit")){
//                    it1.remove();
//                }
//
//
//            }
//        }


    }
}