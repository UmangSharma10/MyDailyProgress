package MultithreadingPackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Test implements Runnable{
    private String name;
    public Test(String s){
        name = s;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i<=5; i++){
                if(i == 0){
                    Date d = new Date();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Intialize Time for" +  name + " = " + simpleDateFormat.format(d));
                }
                else {
                    Date d = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Executing Time for task name - "+
                            name +" = " +ft.format(d));
                }
                Thread.sleep(1000);
            }
            System.out.println(name + "Completed");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

public class TreadPoolEx1{
    static final int maxThread = 3;

    public static void main(String[] args) {
        Runnable r1 = new Test("Task 1");
        Runnable r2 = new Test("task 2");
        Runnable r3 = new Test("task 3");
        Runnable r4 = new Test("task 4");
        Runnable r5 = new Test("task 5");

        // creates a thread pool with MAX_T no. of
        // threads as the fixed pool size(Step 2)
        ExecutorService pool = Executors.newFixedThreadPool(maxThread);

        // passes the Task objects to the pool to execute (Step 3)
        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);

        // pool shutdown ( Step 4)
        pool.shutdown();
    }
}
