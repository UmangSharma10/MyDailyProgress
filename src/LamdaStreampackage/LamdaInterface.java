package LamdaStreampackage;

import java.util.*;

interface ITtest{
    public void Draw();
}

interface ITSayable{
    public String say(String name);
}
public class LamdaInterface {
    public static void main(String[] args) {
        int width = 10;

     /*   ITtest iTtest = new ITtest() {
            @Override
            public void Draw() {
                System.out.println("Overiding Draw Function" + width);

            }
        };*/
       // iTtest.Draw();

        ITtest iTtest1 =()->{
            System.out.println("Drawing " + width);
        };
        iTtest1.Draw();

        ITSayable itSayable = (name)->{
            return "I have nothing to say" + name;
        };

        System.out.println(itSayable.say("Smit"));

        ITSayable itSayable1 = name -> {
            return "Live Updates" + name;
        };
        System.out.println(itSayable1.say("HAha"));

        List<Integer> ll = new ArrayList<>();
        ll.add(2);
        ll.add(3);
        ll.add(5);
        ll.add(6);
        ll.add(8);

        List<Integer> ll1 = new ArrayList<>();
        ll1.add(2);
        ll1.add(3);
        ll1.add(5);
        ll1.add(6);
        ll1.add(8);
        ll1.add(8);


        HashSet<Integer> hs = new HashSet<>();

        for(int n : ll1){
            hs.add(n);
        }


      /*  hs.add(ll);
        hs.add(ll1);
*/
        Iterator iterator = hs.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        ll1.forEach((n) -> {
            System.out.println(n);
        });


    }
}
