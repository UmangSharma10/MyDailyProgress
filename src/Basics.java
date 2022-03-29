class Demo{
    private int i = 10;
    public int j = 11;

    public static void sum(int i , int j){
        int sum = i + j;
        System.out.println(sum);
    }

    public static void sum(float i , float j){
        float sum = i + j;
        System.out.println(sum);
    }

    public static void sum(String i, String j){
        System.out.println(i);
        System.out.println(j);
    }

}

class PrivateTemp{
 /*   protected PrivateTemp(){
        System.out.println("Its private");
    }*/

    public void temp(){
        System.out.println("this method is private");
    }
}

public class Basics extends PrivateTemp {
  public void temp(){
        System.out.println("class Basics");
    }
    public static void main(String[] args) {

        Basics b1 =new Basics();

        //upcast
        PrivateTemp b2 = new Basics();
        b2.temp();

        //downcast
        Basics c = (Basics)b2;
        c.temp();


        b1.temp();


    }
}
