package MultithreadingPackage;

public class MultitreadingExample1 implements Runnable{
    public void run(){
        System.out.println("Thread is Running");
    }
    public static void main(String[] args) {
        MultitreadingExample1 t1 = new MultitreadingExample1();
        Thread t2 = new Thread(t1);
        t2.start();
    }
}
