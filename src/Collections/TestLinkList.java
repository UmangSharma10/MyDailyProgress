package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkList {
 /*   Java LinkedList class can contain duplicate elements.
    Java LinkedList class maintains insertion order.
    Java LinkedList class is non synchronized.
    In Java LinkedList class, manipulation is fast because no shifting needs to occur.
    Java LinkedList class can be used as a list, stack or queue.*/

    /*Since a LinkedList acts as a dynamic array and we do not have to specify the size while creating it,
     the size of the list automatically increases when we dynamically add and remove items.
     And also, the elements are not stored in a continuous fashion. Therefore, there is no need to increase the size.
     Internally, the LinkedList is implemented using the doubly linked list data structure.
     The main difference between a normal linked list and a doubly LinkedList is that a doubly linked list contains an extra pointer,
     typically called the previous pointer, together with the next pointer and data which are there in the singly linked list.*/


    public static void main(String[] args) {
        LinkedList<String> tempLinklist = new LinkedList<>();
        ArrayList<String> tempArray = new ArrayList<>();

        tempArray.add("Smit");
        tempArray.add("Smit2");
        tempArray.add("Smit3");
        tempArray.add("Smit4");
        tempArray.add("Smit5");

        LinkedList<String> secondList = new LinkedList<>();
        LinkedList thirdList = new LinkedList();

        secondList.add("Smit loves food");
        thirdList.add("Smit loves women");

   /*     secondList.set(1,"hi");
        secondList.remove(2);
*/

        tempArray.remove("smit4");

        tempLinklist.addFirst("D");
        tempLinklist.addLast("F");

        System.out.println(secondList);
        System.out.println(thirdList);


        tempLinklist.addAll(tempArray);
        Iterator<String> iterator = tempLinklist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
