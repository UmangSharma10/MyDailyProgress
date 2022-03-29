package Collections;/*The Queue is used to insert elements at the end of the queue and removes from the beginning of the queue. It follows FIFO concept.
  The Java Queue supports all methods of Collection interface including insertion, deletion, etc.
  LinkedList, ArrayBlockingQueue and PriorityQueue are the most frequently used implementations.
  If any null operation is performed on BlockingQueues, NullPointerException is thrown.
  The Queues which are available in java.util package are Unbounded Queues.
  The Queues which are available in java.util.concurrent package are the Bounded Queues.
  All Queues except the Deques supports insertion and removal at the tail and head of the queue respectively. The Deques support element insertion and removal at both ends.
  package simpleprojectmanagement;*/

import java.util.*;

/*
public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new LinkedList<>();

        for(int i = 0; i<8; i++){
            integerQueue.add(i);
        }
        System.out.println(integerQueue);

        int removehead = integerQueue.remove();

        System.out.println(integerQueue);
        System.out.println(removehead);

        //to view the head of the file

        int headofqueue = integerQueue.peek();
        System.out.println(headofqueue);

        System.out.println(integerQueue.size());

        /////Priority Queue//////

        Queue<String> stringQueue = new PriorityQueue<>();
        stringQueue.add("Krunal Bro");
        stringQueue.add("Smit bro");
        stringQueue.add("Vedant bro");
        stringQueue.add("Umang Bro");
        stringQueue.add("aadarsh bro");


        System.out.println(stringQueue);







    }
}
*/
class The_Comparator implements Comparator<String>{
    public int compare(String s1, String s2){
        String firststr;
        String secondstr;
        firststr = s1;
        secondstr = s2;
        return firststr.compareTo(secondstr);

    }

}
class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(30);

        System.out.println(priorityQueue.contains(10));
        System.out.println(priorityQueue.add(20));
        System.out.println(priorityQueue.size());
        System.out.println(priorityQueue.peek());
        // System.out.println(priorityQueue.poll());
        //  System.out.println(priorityQueue.remove(10));

        Iterator iterator = priorityQueue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }

        System.out.println("***********************************************");
        PriorityQueue<String> queue = new
                PriorityQueue<String>(new The_Comparator());

        queue.add("G");
        queue.add("E");
        queue.add("E");
        queue.add("K");
        queue.add("S");
        queue.add("4");

        queue.comparator();
        System.out.println(queue);
        System.out.println("The elements with the lowest priority element at front of queue"
                + "order:");
        while (!queue.isEmpty()) {
            System.out.print(" " + queue.poll());
        }
    }
}
